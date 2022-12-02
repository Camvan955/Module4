package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.model.Orders;
import com.example.book.service.IBookService;
import com.example.book.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;


@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IOrderService orderService;

    @GetMapping("")
    public String showList(Model model){
        Iterable<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "book/list";
    }

    @GetMapping("/borrow/{id}")
    public String borrow(@PathVariable int id, Model model) {
        Book book = bookService.findById(id).get();
        model.addAttribute("borrowBook", book);
        model.addAttribute("order", new Orders(book));
        return "book/borrow";
    }

    @PostMapping("/borrow")
    public String borrow(@ModelAttribute("order") Orders order, RedirectAttributes redirectAttributes) {
        int code = (int) (Math.random() * (99999 - 10000)) + 10000;
        order.setCode(code);
        orderService.save(order);
        redirectAttributes.addFlashAttribute("mess", "Borrow successful");
        redirectAttributes.addFlashAttribute("mess1", "The book you are borrowing is: " + order.getBook().getName() + " ,code borrow " + code);
        return "redirect:/book";
    }

    @GetMapping("/pay/{id}")
    public String pay(@PathVariable int id, Model model) {
        Book book = bookService.findById(id).get();
        model.addAttribute("book", book);
        return "book/pay";
    }

    @PostMapping("/pay")
    public String pay(Book book, RedirectAttributes redirectAttributes, int id, Model model) {
        if (orderService.isCheck(id)) {
            bookService.addById(book.getId());
            redirectAttributes.addFlashAttribute("mess", "pay successful");
            return "redirect:/book";
        }
        model.addAttribute("book", book);
        model.addAttribute("mess", "code borrow wrong, enter code borrow again");
        return "book/pay";
    }

}
