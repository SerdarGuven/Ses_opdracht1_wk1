package be.kuleuven;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckNeighboursInGrid {


    public static Iterable<Integer> getSameNeighboursIds(Iterable<Integer> grid,int width, int height, int indexToCheck){
        //write you code below

        //position of indexToCheck
        int column = indexToCheck % width;
        int row = indexToCheck / width;

        //making Arraylist to check values
        Iterator<Integer> gridIterator = grid.iterator();

        ArrayList<Integer> gridList = new ArrayList<>();
        ArrayList<Integer> solution = new ArrayList<>();

        while (gridIterator.hasNext()){
            Integer x = gridIterator.next();
            gridList.add(x);
        }

        //check row above: left corner - middle - right corner
        int above = indexToCheck - width;

        if(row > 0 && column > 0 && gridList.get(indexToCheck) == gridList.get(above -1)) {
            Integer left = above - 1;
            solution.add(left);
        }

        if(row > 0 && gridList.get(indexToCheck) == gridList.get(above)) {
            Integer middle = above;
            solution.add(middle);
        }

        if(row > 0 && column < (width -1) && gridList.get(indexToCheck) == gridList.get(above + 1)) {
            Integer right = above + 1;
            solution.add(right);
        }

        //check left side
        if(column > 0 && gridList.get(indexToCheck) == gridList.get(indexToCheck - 1)) {
            Integer left = indexToCheck - 1;
            solution.add(left);
        }

        //check right side
        if(column < (width - 1) && gridList.get(indexToCheck) == gridList.get(indexToCheck + 1)) {
            Integer right = indexToCheck + 1;
            solution.add(right);
        }

        //row below: left corner - middle - right corner
        int below = indexToCheck + width;

        if(row < (height -1) && column > 0 && gridList.get(indexToCheck) == gridList.get(below - 1)){
            Integer left = below - 1;
            solution.add(left);
        }

        if(row < (height -1) && gridList.get(indexToCheck) == gridList.get(below)) {
            Integer middle = below;
            solution.add(middle);
        }

        if(row < (height -1) && column < (width - 1) && gridList.get(indexToCheck) == gridList.get(below + 1)) {
            Integer right = below + 1;
            solution.add(right);
        }

        Iterable<Integer> result = solution;





        return result;
    }







}
