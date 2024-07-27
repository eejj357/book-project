package com.group.libraryapp.domain.user.LoanHistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// select * from user_loan_history where book_name = ? and is_return = ?
public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {
    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);

    Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);
}
