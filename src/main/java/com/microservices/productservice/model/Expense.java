package com.microservices.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Getter
@Setter
// @AllArgsConstructor
@NoArgsConstructor
@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String expenseName;
    @Field("category")
    private ExpenseCategory expenseCategory;
    @Field("amount")
    private BigDecimal expenseAmount;

    public Expense(String id, String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseCategory = expenseCategory;
        this.expenseAmount = expenseAmount;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}