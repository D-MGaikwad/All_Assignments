package company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class News_Q4toQ7 {
	
	public static void main(String[] args) {

	        List<News> news = Arrays.asList(
			new News(4421,"Lily Parker","Steve Banner","Satisfying budget this year."),
			new News(4345,"Rama Patil","Varun Singh","This is sad."),
			new News(4458,"Daisy Johnson","Steve Banner","Good information."),
			new News(4421,"James Evans","Mark Smith","Budget"),
			new News(4426,"Raman Varma","Manavi Singh","Great share!")
		     );	
	
	    news.forEach(System.out::println);
	    System.out.println(" ");
	
	    Integer comm= news.stream().collect(Collectors.groupingByConcurrent(News::getNewsId,Collectors.counting()))
			                                  .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
			
	        System.out.println("4. News_Id with the maximum comments is "+comm);
			
			System.out.println();

	    Boolean commentsBased =news.stream().anyMatch(d -> d.getComment().equals("budget"));	
		    System.out.println("5. "+commentsBased);
			
			
		String maxCommentUser= news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()))
					.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
			
		    System.out.println(" ");		
			System.out.println("6. The user with the maximum comments is '"+maxCommentUser+ ".'");

			System.out.println(" ");
			Map<String, Long> commByUser= news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
			System.out.println("7. CommentByUser wise number of comments: " +commByUser);
			
			
}
}
