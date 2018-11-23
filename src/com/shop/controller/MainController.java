package com.shop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.beans.Product;
import com.shop.beans.Vendor;

@Controller
public class MainController {
	@Autowired
	Product p;
	private Vendor vendor;

	@RequestMapping("/")
	public String showHome(Model model) {
		List<Product> list = p.getAllProduct();

		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping(value = "/vendor-register", method = RequestMethod.POST)
	public String doRegister(Model model, @Valid Vendor v, BindingResult result) {
		if (result.hasErrors()) {
			return "vendor";
		}
		this.vendor.createVendor(v);
		model.addAttribute("name", v.getName());
		model.addAttribute("city", v.getCity());
		return "set_password";
	}

	@RequestMapping("/vendor-registration")
	public String reqRegister(Model model) {
		model.addAttribute("vendor", new Vendor());
		return "vendor";
	}

	@RequestMapping("/add-product")
	public String addProduct() {

		return "add_product";
	}

	@Autowired
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

}
