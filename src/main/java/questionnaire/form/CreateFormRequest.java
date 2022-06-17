package questionnaire.form;

import lombok.Data;

import java.util.List;

@Data
public class CreateFormRequest {
    private String authorId;
    private String subject;
    private List<String> attachments;
    private List<String> questions;
}