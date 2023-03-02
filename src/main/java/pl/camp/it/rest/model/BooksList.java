package pl.camp.it.rest.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import pl.camp.it.rest.model.Book;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object to handle list of books
 **/
@ApiModel(description="Object to handle list of books")
public class BooksList  {
  
  @ApiModelProperty(value = "List of books")
 /**
   * List of books
  **/
  private List<Book> books = null;
 /**
   * List of books
   * @return books
  **/
  @JsonProperty("books")
  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public BooksList books(List<Book> books) {
    this.books = books;
    return this;
  }

  public BooksList addBooksItem(Book booksItem) {
    this.books.add(booksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooksList {\n");
    
    sb.append("    books: ").append(toIndentedString(books)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

