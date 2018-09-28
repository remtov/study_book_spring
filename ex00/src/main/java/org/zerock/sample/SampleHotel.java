package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor //변수로 선언된 모든 것을 파라미터로 받는 생성자를 작성한다. // 이 어노테이션을 추가하면 생성자 구문이 필요없다.
/*@RequiredArgsConstructor 특정변수만 생성자파라미터로 만들고싶을때이걸쓴다.*/
public class SampleHotel {

	private Chef chef;

	/*@NonNull--특정변수만 생성자파라미터로 만들고싶을때이걸쓴다.
	 * public SampleHotel(Chef chef) { this.chef = chef;
	 * 
	 * }
	 */

}
