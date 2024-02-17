package edu.wctc.croquet;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Complete this class to hold data from croquetGlossary.json
 */

@Data
@NoArgsConstructor
public class GlossaryTerm {
    private String term;
    private String definition;
    private String regulation;
}
