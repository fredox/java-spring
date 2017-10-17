package com.privalia.entity.listas;

import java.util.List;

public class Student {
	private int idStudent;
	private String name;
	private String surname;
	private int age;
	private List<Teacher> listTeacher;
	
	/**
	 * @return the idStudent
	 */
	public int getIdStudent() {
		return idStudent;
	}
	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the listTeacher
	 */
	public List<Teacher> getListTeacher() {
		return listTeacher;
	}
	/**
	 * @param listTeacher the listTeacher to set
	 */
	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}
}
