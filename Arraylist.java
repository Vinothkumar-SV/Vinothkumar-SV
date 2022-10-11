package wek3day2;

import java.util.List;

import Week3.day1.String;

public class Arraylist {
	public static void main(String[] args) {

	List<Integer> lst = Arraylist();
    //add the data in list
    //listname.add
    lst.add(10);
    lst.add(70);
    lst.add(50);
    lst.add(60);
    lst.add(30);
    lst.add(3, 11);
    lst.add(30);
    lst.add(70);
    //To print the list
    System.out.println(lst);
    //To remove data from list
    lst.remove(4);//based on index
    System.out.println(lst);
    //contains
    System.out.println(lst.contains(60));
    //clear
    //lst.clear();
    System.out.println(lst);
    //isEmpty
    System.out.println(lst.isEmpty());
    //get particular index get(index)
    System.out.println(lst.get(5));
    //size of list
    System.out.println(lst.size());
    }

	private static List<Integer> Arraylist() {
		// TODO Auto-generated method stub
		return null;
	}

	}
	

