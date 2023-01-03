package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="taskid")
	private int taskid;
	@Column(name ="tasktitle")
	private String tasktitle;
	
	@Column(name ="taskdesc")
	private String taskdesc;
	
	public Task() {}

	public Task(int taskid, String tasktitle, String taskdesc) {
		super();
		this.taskid = taskid;
		this.tasktitle = tasktitle;
		this.taskdesc = taskdesc;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTasktitle() {
		return tasktitle;
	}

	public void setTasktitle(String tasktitle) {
		this.tasktitle = tasktitle;
	}

	public String getTaskdesc() {
		return taskdesc;
	}

	public void setTaskdesc(String taskdesc) {
		this.taskdesc = taskdesc;
	}
	

	
	
	
	
}
