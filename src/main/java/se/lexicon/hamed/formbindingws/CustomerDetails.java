package se.lexicon.hamed.formbindingws;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CustomerDetails {

    private String detailsId;
    private String street;
    private String zipCode;
    private String city;
    private String homePhone;
    private String cellPhone;

}
