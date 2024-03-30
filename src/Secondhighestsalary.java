import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secondhighestsalary {

	public static void main(String[] args) {
	int []a= {23,43,54,56,99,58};
	List<Integer> collect = Arrays.stream(a).mapToObj(i->i).sorted((i1,i2)->(i2-i1))
			.skip(1)
			.limit(1)
			.collect(Collectors.toList());
			
	collect.forEach(i->System.out.println("secondhighestsalary="+i));
		
	Optional<Integer> collect2 = Arrays.stream(a).mapToObj(i->i).collect(Collectors.minBy((i1,i2)->i1-i2));
		Integer integer = collect2.get();
		System.out.println(integer);
		
		
		
	}

}
