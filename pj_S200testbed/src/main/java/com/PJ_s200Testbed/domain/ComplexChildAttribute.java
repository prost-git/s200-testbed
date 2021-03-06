package com.PJ_s200Testbed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ComplexChildAttribute {
	public int cc_fk;
	public String title;
	public String value;
	
	public int getCc_fk() {
		return cc_fk;
	}
	public void setCc_fk(int cc_fk) {
		this.cc_fk = cc_fk;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
