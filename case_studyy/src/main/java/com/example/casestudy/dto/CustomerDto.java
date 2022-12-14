package com.example.casestudy.dto;

import com.example.casestudy.model.customer.CustomerType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CustomerDto implements Validator {

    private int id;

    @NotEmpty(message = "Tên khách hàng không được để trống")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "Tên khách hàng không được chứa số, mỗi kí tự đầu tiên của mỗi từ phải viết hoa")
    private String name;

    @NotEmpty(message = " không được rỗng")
    private String dateOfBirth;
    private Double gender;
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "số CMND không đúng định dạng")
    private String idCard;
    @Pattern(regexp = "^(((\\\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})$", message = "Số điện thoại phải đúng định dạng")
    private String phoneNumber;
    @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Email chưa đúng định dạng(***@**.***)")
    private String email;
    @NotEmpty(message = "địa chỉ không được rỗng")
    private String address;

    private CustomerType customerType;

    public CustomerDto() {
    }

    public CustomerDto(int id, @NotEmpty(message = "Tên khách hàng không được để trống") @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "Tên kách hàng không được chứa số, mỗi kí tự đầu tiên của mỗi từ phải viết hoa") String name, @NotEmpty(message = " không được rỗng") String dateOfBirth, Double gender, @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "số CMND không đúng định dạng") String idCard, @Pattern(regexp = "^(((\\\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})$", message = "Số điện thoại phải đúng định dạng") String phoneNumber, @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Email chưa đúng định dạng(***@**.***)") String email, @NotEmpty(message = " không được rỗng") String address, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getGender() {
        return gender;
    }

    public void setGender(Double gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }


    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customerDto = (CustomerDto) target;
    }
}
