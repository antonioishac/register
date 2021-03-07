package br.com.cactusdigital.erp.register.exception.dto;

import java.io.Serializable;
import java.util.List;

public class PageDTO<T> implements Serializable  {

	private int number;

	private int size;

	private int numberOfElements;

	private List<T> content;

	private boolean first;

	private boolean last;

	private int totalPages;

	private long totalElements;

	public PageDTO(List<T> content) {
		this.content = content;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public boolean isFirst() {
		return first;
	}

	public void isFirst(boolean first) {
		this.first = first;
	}

	public boolean isLast() {
		return last;
	}

	public void isLast(boolean last) {
		this.last = last;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
}
