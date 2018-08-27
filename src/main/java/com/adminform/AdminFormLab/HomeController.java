package com.adminform.AdminFormLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adminform.AdminFormLab.dao.ItemRepository;
import com.adminform.AdminFormLab.entity.Items;

@Controller
public class HomeController {
	@Autowired
	ItemRepository itemDao;

	// First page to display link to items inventory
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	// Maps to items list and extracts from SQL database table
	@RequestMapping("/itemslist")
	public ModelAndView listItems() {

		return new ModelAndView("itemslist", "list", itemDao.findAll());
	}

	// Allows user to update item and links the update to database using the id
	// primary key
	@RequestMapping("itemslist/{id}/update")
	public ModelAndView showEditItem(@PathVariable("id") Items item) {
		ModelAndView mv = new ModelAndView("itemform");
		mv.addObject("title", "Update Item"); // to show title in food-form jsp without hard coding
		mv.addObject("item", item);
		return mv;
	}

	// Saves edit to database and adds to list that displays on client side
	@PostMapping("/itemslist/{id}/update")
	public ModelAndView submitEditForm(Items items) { // @PathVariable("id") Long id) {
		// items.setId(id);
		itemDao.save(items);
		return new ModelAndView("redirect:/itemslist");
	}

	// Deletes by id once clicked
	@RequestMapping("/itemslist/{id}/delete")
	public ModelAndView deleteItem(@PathVariable("id") Long id) {

		itemDao.deleteById(id);
		return new ModelAndView("redirect:/itemslist");

	}

//redirects to itemform(same as edit form) to add a new item
	@RequestMapping("/itemslist/add")
	public ModelAndView showAddItem() {
		ModelAndView mv = new ModelAndView("itemform");
		mv.addObject("title", "Add an Item");
		return mv;
	}

// creates new object and saves to database, redirects to display list with added item
	@PostMapping("/itemslist/add")
	public ModelAndView submitAddItem(Items item) {

		itemDao.save(item);
		return new ModelAndView("redirect:/itemslist");
	}
}
