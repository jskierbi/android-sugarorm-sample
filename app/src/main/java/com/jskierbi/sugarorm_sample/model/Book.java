package com.jskierbi.sugarorm_sample.model;

import com.orm.SugarRecord;

/**
 * Created by jakub on 01/06/15.
 */
public class Book extends SugarRecord<Book> {

  String title;
  String edition;
  Author author;

  public Book() {
  }

  public Book(String title, String edition) {
    this.title = title;
    this.edition = edition;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", edition='" + edition + '\'' +
        ", author=" + author +
        '}';
  }
}
