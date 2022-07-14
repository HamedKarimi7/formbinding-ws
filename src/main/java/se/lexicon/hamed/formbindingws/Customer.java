package se.lexicon.hamed.formbindingws;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    private String customerId;
    private String email;
    private LocalDate regDate;
    boolean active = true;
    private CustomerDetails details;

}
