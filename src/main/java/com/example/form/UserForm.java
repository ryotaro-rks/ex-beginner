package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {
	@NotBlank(message = "名前を入力してください")
	private String name;
	@NotNull(message = "年齢を入力してください")
	private Integer age;
	@NotBlank(message = "コメントが空です")
	@Size(min = 1, max = 1000, message = "1~1000文字で入力してください")
	private String comment;

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
