package com.brianchang.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="books")
public class Book {
	
	//auto-incrementing ID
	@Id
	@GeneratedValue
	private Long id;
	
	
	//Columns
	@Column
    @Size(min = 3, max = 20)
    private String title;
    
	@Column
    @Size(min = 5, max = 200)
    private String description;
    
	@Column
    @Size(min = 3, max = 40)
    private String language;
    
	@Column
    @Min(100)
    private int numberOfPages;
    
	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM/dd/yyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyy HH:mm:ss")
	private Date updatedAt;
	
	//Constructor
    public Book() {
    }
    
    //Constructor
    public Book(String title, String desc, String lang, int pages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;
    }
    
    //automatically create dates.
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
    
    
    
    
    //Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    
}