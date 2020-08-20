package p259;

import java.util.ArrayList;
import java.util.List;

public class AStar {

    //�Թ���ͼ
    public static final int[][] MAZE = {
            { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 }
    };

    /**
     * A��Ѱ·���߼�
     * @param start  �Թ����
     * @param end  �Թ��յ�
     */
    public static Grid aStarSearch(Grid start, Grid end) {
        ArrayList<Grid> openList = new ArrayList<Grid>();
        ArrayList<Grid> closeList = new ArrayList<Grid>();
        //�������� openList
        openList.add(start);
        //��ѭ����ÿһ�ּ��һ����ǰ����ڵ�
        while (openList.size() > 0) {
            // ��openList�в��� Fֵ��С�Ľڵ���Ϊ��ǰ����ڵ�
            Grid currentGrid = findMinGird(openList);
            // ��ǰ����ڵ��openList���Ƴ�
            openList.remove(currentGrid);
            // ��ǰ����ڵ���� closeList
            closeList.add(currentGrid);
            // �ҵ������ڽ��ڵ�
            List<Grid> neighbors = findNeighbors(currentGrid, openList, closeList);
            for (Grid grid : neighbors) {
                if (!openList.contains(grid)) {
                    //�ڽ��ڵ㲻��openList�У���Ǹ��ס�G��H��F��������openList
                    grid.initGrid(currentGrid, end);
                    openList.add(grid);
                }
            }
            //����յ���openList�У�ֱ�ӷ����յ����
            for (Grid grid : openList){
                if ((grid.x == end.x) && (grid.y == end.y)) {
                    return grid;
                }
            }
        }
        //openList�þ�����Ȼ�Ҳ����յ㣬˵���յ㲻�ɵ�����ؿ�
        return null;
    }

    private static Grid findMinGird(ArrayList<Grid> openList) {
        Grid tempGrid = openList.get(0);
        for (Grid grid : openList) {
            if (grid.f < tempGrid.f) {
                tempGrid = grid;
            }
        }
        return tempGrid;
    }

    private static ArrayList<Grid> findNeighbors(Grid grid, List<Grid> openList, List<Grid> closeList) {
        ArrayList<Grid> gridList = new ArrayList<Grid>();
        if (isValidGrid(grid.x, grid.y-1, openList, closeList)) {
            gridList.add(new Grid(grid.x, grid.y - 1));
        }
        if (isValidGrid(grid.x, grid.y+1, openList, closeList)) {
            gridList.add(new Grid(grid.x, grid.y + 1));
        }
        if (isValidGrid(grid.x-1, grid.y, openList, closeList)) {
            gridList.add(new Grid(grid.x - 1, grid.y));
        }
        if (isValidGrid(grid.x+1, grid.y, openList, closeList)) {
            gridList.add(new Grid(grid.x + 1, grid.y));
        }
        return gridList;
    }

    private static boolean isValidGrid(int x, int y, List<Grid> openList, List<Grid> closeList) {
        //�Ƿ񳬹��߽�
        if (x < 0 || x >= MAZE.length || y < 0 || y >= MAZE[0].length) {
            return false;
        }
        //�Ƿ����ϰ���
        if(MAZE[x][y] == 1){
            return false;
        }
        //�Ƿ��Ѿ���openList��
        if(containGrid(openList, x, y)){
            return false;
        }
        //�Ƿ��Ѿ���closeList��
        if(containGrid(closeList, x, y)){
            return false;
        }
        return true;
    }

    private static boolean containGrid(List<Grid> grids, int x, int y) {
        for (Grid grid : grids) {
            if ((grid.x == x) && (grid.y == y)) {
                return true;
            }
        }
        return false;
    }

    static class Grid {
        public int x;
        public int y;
        public int f;
        public int g;
        public int h;
        public Grid parent;

        public Grid(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void initGrid(Grid parent, Grid end){
            this.parent = parent;
            if(parent != null){
                this.g = parent.g + 1;
            }else {
                this.g = 1;
            }
            this.h = Math.abs(this.x - end.x) + Math.abs(this.y - end.y);
            this.f = this.g + this.h;
        }
    }

    public static void main(String[] args) {
        //���������յ�
        Grid startGrid = new Grid(2, 1);
        Grid endGrid = new Grid(2, 5);
        //�����Թ��յ�
        Grid resultGrid = aStarSearch(startGrid, endGrid);
        //�����Թ�·��
        ArrayList<Grid> path = new ArrayList<Grid>();
        while (resultGrid != null) {
            path.add(new Grid(resultGrid.x, resultGrid.y));
            resultGrid = resultGrid.parent;
        }
        //����Թ���·����·�����Ǻű�ʾ
        for (int i = 0; i < MAZE.length; i++) {
            for (int j = 0; j < MAZE[0].length; j++) {
                if (containGrid(path, i, j)) {
                    System.out.print("*, ");
                } else {
                    System.out.print(MAZE[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }
}