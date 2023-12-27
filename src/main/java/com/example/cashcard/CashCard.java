package com.example.cashcard;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount) {
}

// reason for above errors?
// 1. CashCard.java is not a valid java file. It is a record. It is a new feature in java 14.
// 2. CashCardApplicationTests.java is not a valid java file. It is a test file. It is a new feature in java 14.
// 3. CashcardApplication.java is not a valid java file. It is a java file. It is a new feature in java 14.
// 4. CashCardController.java is not a valid java file. It is a java file. It is a new feature in java 14.

