package LambdaAndStream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ExamData {
    private String studentName;
    private double testScore;
    public ExamData(String name, double score){
        studentName = name;
        testScore = score;
    }

    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<>();
        data.add(new ExamData("George", 91.3));
        data.add(new ExamData("Tom",88.9));
        data.add(new ExamData("Rick",80));
        data.add(new ExamData("Harold",90.8));
        data.add(new ExamData("Ignatius",60.9));
        data.add(new ExamData("Anna",77));
        data.add(new ExamData("Susan",87.3));
        data.add(new ExamData("Phil",99.1));
        data.add(new ExamData("Alex",84));


//        System.out.printf("Max TestScore: %.2f", data.stream().mapToDouble(a->a.testScore).max().getAsDouble());
//        System.out.println();
//        System.out.printf("Min TestScore: %.2f", data.stream().mapToDouble(a->a.testScore).min().getAsDouble());
//        System.out.println();
//        System.out.printf("Average test score: %.2f", data.stream().mapToDouble(a-> a.testScore).average().getAsDouble());

        DoubleSummaryStatistics stats = data.stream().mapToDouble(a->a.testScore)
                .summaryStatistics();

        System.out.printf("Top test score: %.2f%n" , stats.getMax());
        System.out.printf("Lowest test score: %.2f%n" , stats.getMin());
        System.out.printf("Average test score: %.2f%n" , stats.getAverage());

    }

}
