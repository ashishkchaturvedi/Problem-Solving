package com.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		int rowIndex = 3;
		System.out.println(generate(rowIndex));

	}
	
	public static List<Integer> generate(int rowIndex) {
    	List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    	
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // First base case; if user requests zero rows, they get zero rows.
        if (rowIndex == 0) {
            return triangle.get(0);
        }

        for (int rowNum = 1; rowNum <= rowIndex; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }

}
