package com.hb04.bi_onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student04 {

	@Id
	private int id;

	@Column(name = "std_name")
	private String name;

	private int grade;

	@OneToOne(mappedBy = "student")
	private Diary02 diary;

	public Diary02 getDiary() {
		return diary;
	}

	public void setDiary(Diary02 diary) {
		this.diary = diary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student04 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
