package leetcode;

public class leetcode463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(islandPerimeter(grid));
	}
    public static  int islandPerimeter(int[][] grid) {
    	int nums=0,neighb=0;
        for(int i=0;i<grid.length;i++)
        	for(int j=0;j<grid[i].length;j++){
        		if(grid[i][j]==1){
        			nums++;
        			if(j<grid[i].length-1&&grid[i][j+1]==1)  neighb++;
        			if(i<grid.length-1&&grid[i+1][j]==1) neighb++;
        		}
        	}
        return nums*4-neighb*2;
    }
}
