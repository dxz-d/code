package p259;

import java.util.ArrayList;
import java.util.List;

//A��Ѱ·��
public class ASearchTest {
    private static final int[][] MAZE = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
    };

    public static void main(String[] args) {
        //���������յ�
        Grid startGrid = new Grid(2, 1);
        Grid endGrid = new Grid(2, 5);
        //�����Թ��յ�
        Grid resultGrid = aStarSearch(startGrid, endGrid);
        //�����Թ�·��
        ArrayList<Grid> path = new ArrayList<>();
        while (resultGrid != null) {
            path.add(new Grid(resultGrid.x, resultGrid.y));
            resultGrid = resultGrid.parent;
        }
        //����Թ���·����·����*��ʾ
        for (int i = 0; i < MAZE.length; i++) {
            for (int j = 0; i < MAZE[0].length; j++) {
                if (containGrid(path, i, j)) {
                    System.out.print("*, ");
                } else {
                    System.out.print(MAZE[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A*Ѱ·���߼�
     *
     * @param start �Թ����
     * @param end   �Թ��յ�
     * @return
     */
    private static Grid aStarSearch(Grid start, Grid end) {
        ArrayList<Grid> openList = new ArrayList<Grid>();
        ArrayList<Grid> closeList = new ArrayList<Grid>();
        //��������openList
        openList.add(start);
        //��ѭ����ÿһ�ּ��1����ǰ����ڵ�
        while (openList.size() > 0) {
            //��openList�в���Fֵ��С�Ľڵ㣬������Ϊ��ǰ����ڵ�
            Grid currentGrid = findMinGrid(openList);
            //����ǰ����ڵ��openList���Ƴ�
            openList.remove(currentGrid);
            //��ǰ��������closeList
            closeList.add(currentGrid);
            //�ҵ������ٽ��ڵ�
            List<Grid> neighbors = findNeighbors(currentGrid, openList, closeList);
            for (Grid grid : neighbors) {
                if (!openList.contains(grid)) {
                    //�ڽ��ڵ㲻��openList�У���ǡ����ڵ㡱��G��H��F��������openList
                    grid.initGrid(currentGrid, end);
                    openList.add(grid);
                }
            }
            //����յ���openList�У�ֱ�ӷ����յ����
            for (Grid grid : openList) {
                if ((grid.x == end.x) && (grid.y == end.y)) {
                    return grid;
                }
            }
        }
        //openList�þ�����Ȼ�Ҳ����յ㣬˵���յ㲻�ɵ�����ؿ�
        return null;
    }

    private static ArrayList<Grid> findNeighbors(Grid grid, List<Grid> openList, List<Grid> closeList) {
        ArrayList<Grid> gridList = new ArrayList<Grid>();
        if (isValidGrid(grid.x, grid.y - 1, openList, closeList)) {
            gridList.add(new Grid(grid.x, grid.y - 1));
        }
        if (isValidGrid(grid.x, grid.y + 1, openList, closeList)) {
            gridList.add(new Grid(grid.x, grid.y + 1));
        }
        if (isValidGrid(grid.x - 1, grid.y, openList, closeList)) {
            gridList.add(new Grid(grid.x - 1, grid.y));
        }
        if (isValidGrid(grid.x + 1, grid.y, openList, closeList)) {
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
        if (MAZE[x][y] == 1) {
            return false;
        }
        //�Ƿ��Ѿ���openList
        if (containGrid(openList, x, y)) {
            return false;
        }
        //�Ƿ��Ѿ���closeList��
        if (containGrid(closeList, x, y)) {
            return false;
        }
        return true;
    }

    private static boolean containGrid(List<Grid> grids, int x, int y) {
        for (Grid n : grids) {
            if ((n.x == x) && (n.y == y)) {
                return true;
            }
        }
        return false;
    }

    private static Grid findMinGrid(ArrayList<Grid> openList) {
        Grid tempGrid = openList.get(0);
        for (Grid grid : openList) {
            if (grid.f < tempGrid.f) {
                tempGrid = grid;
            }
        }
        return tempGrid;
    }
}
