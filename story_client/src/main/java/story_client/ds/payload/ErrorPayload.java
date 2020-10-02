package story_client.ds.payload;

import lombok.Data;

@Data
public class ErrorPayload {
    private String timestamp;
    private String message;
    private String details;
}
