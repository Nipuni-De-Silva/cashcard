package com.example.cashcard;

//import org.springframework.data.repository.CrudRepository;
// give correct import for above
import org.springframework.data.repository.CrudRepository;
interface CashCardRepository extends CrudRepository<CashCard, Long> {
}