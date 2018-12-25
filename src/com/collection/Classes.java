package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Classes {
	private String claname;	//班级名称
	
	private ArrayList<Student> studentlites;
	//定义班级包含的所有学生名字
	private String[] studentname;
	//集合-hashset
	private HashSet<Student> stulisthashset;
	//集合-hashmap
	private HashMap<Integer, Student> stuhashMap;
	
	
	public String getClaname() {
		return claname;
	}
	public void setClaname(String claname) {
		this.claname = claname;
	}
	
	public ArrayList<Student> getStudentlites() {
		return studentlites;
	}
	public void setStudentlites(ArrayList<Student> studentlites) {
		this.studentlites = studentlites;
	}
	
	
	public String getName() {
		return claname;
	}
	public void setName(String name) {
		this.claname = name;
	}
	public String[] getStudentname() {
		return studentname;
	}
	public void setStudentname(String[] studentname) {
		this.studentname = studentname;
	}
	public HashSet<Student> getStulisthashset() {
		return stulisthashset;
	}
	public void setStulisthashset(HashSet<Student> stulisthashset) {
		this.stulisthashset = stulisthashset;
	}
	public HashMap<Integer, Student> getStuhashMap() {
		return stuhashMap;
	}
	public void setStuhashMap(HashMap<Integer, Student> stuhashMap) {
		this.stuhashMap = stuhashMap;
	}
	
}
