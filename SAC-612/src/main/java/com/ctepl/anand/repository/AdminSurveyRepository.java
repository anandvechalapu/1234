@Repository
public interface AdminSurveyRepository extends JpaRepository<AdminSurvey, Long> {

    Optional<AdminSurvey> findByDomain(String domain);
    Optional<AdminSurvey> findByStatus(String status);
    Optional<AdminSurvey> findBySurveyState(String surveyState);
    Optional<AdminSurvey> findByPageNameOrLocation(String pageNameOrLocation);
    Optional<AdminSurvey> findByTargetUsers(String targetUsers);
    Optional<AdminSurvey> findBySpecialty(String specialty);
    Optional<AdminSurvey> findByPreferences(String preferences);
    Optional<AdminSurvey> findByCountry(String country);
    Optional<AdminSurvey> findByRegionAndCity(String region, String city);
    Optional<AdminSurvey> findBySpecificUsers(List<User> specificUsers);
    Optional<AdminSurvey> findByQuestionsTitleAndAnswerType(String title, String answerType);
    Optional<AdminSurvey> findByRatingRange(int start, int end);
    Optional<AdminSurvey> findByStartDateAndEndDate(Date startDate, Date endDate);
    void deleteBySurveyState(String surveyState);
    Optional<AdminSurvey> findByUserResponseOnQuestions(List<Question> questions);
}