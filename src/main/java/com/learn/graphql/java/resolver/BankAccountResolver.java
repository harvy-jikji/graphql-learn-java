package com.learn.graphql.java.resolver;

import com.learn.graphql.java.bank.BankAccount;
import com.learn.graphql.java.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
      log.info("Retrieving Bank account id : {}", id);
      return BankAccount.builder().id(id).currency(Currency.USD).name("philip").build();
    }
}
