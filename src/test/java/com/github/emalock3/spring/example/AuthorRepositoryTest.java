package com.github.emalock3.spring.example;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import com.github.emalock3.spring.example.domain.Author;
import com.github.emalock3.spring.example.domain.AuthorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AuthorRepositoryTest {
  
  @Autowired
  AuthorRepository authorRepository;
  
  @Test
  public void testFindAll() {
    Iterable<Author> authors = authorRepository.findAll();
    assertThat(authors, is(not(nullValue())));
  }
  
  @Test
  public void testDeleteAll() {
    authorRepository.deleteAll();
    assertThat(authorRepository.count(), is(0L));
    
  }
  
  @Test
  public void testSave() {
    authorRepository.deleteAll();
    Author author = authorRepository.save(new Author("hoge"));
    assertThat(author, is(not(nullValue())));
  }
}
