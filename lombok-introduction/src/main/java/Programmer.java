import lombok.*;

/**
 * @author chiennghe
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Programmer {
    private String id;
    private String name;
    private byte age;
}
