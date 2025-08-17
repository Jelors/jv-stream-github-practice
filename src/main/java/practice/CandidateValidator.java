package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    static final int MIN_PERIOD_TO_VOTE = 10;
    static final int MIN_AGE_TO_VOTE = 35;

    @Override
    public boolean test(Candidate candidate) {
        if (candidate.getAge() >= MIN_AGE_TO_VOTE
                && candidate.getNationality().equals("Ukrainian")
                && candidate.calculatePeriodInUkr(candidate.getPeriodsInUkr()) >= MIN_PERIOD_TO_VOTE
                && candidate.isAllowedToVote()) {
            return true;
        }
        return false;
    }
}
