package com.jskierbi.sugarorm_sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jskierbi.sugarorm_sample.model.Author;
import com.jskierbi.sugarorm_sample.model.Book;

import java.util.List;


public class MainActivity extends ActionBarActivity {

  private static final String TAG = MainActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
  }

  @OnClick(R.id.btn_save_new_book)
  void readBooksClick() {
    Book book = new Book("Book title", "Book edition");
    Author author = new Author("Bob", "Dylan");
    author.save();
    book.setAuthor(author);
    book.save();
  }

  @OnClick(R.id.btn_read_books)
  void saveNewBookClick() {
    List<Book> books = Book.listAll(Book.class);

    for (Book book : books) {
      Log.d(TAG, "" + book);
    }
  }

  @OnClick(R.id.btn_delete_all_books)
  void deleteAllBooks() {
    Book.deleteAll(Book.class);
  }
}
