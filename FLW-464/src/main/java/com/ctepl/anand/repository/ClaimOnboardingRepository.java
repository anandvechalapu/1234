@Repository
public interface ClaimOnboardingRepository extends JpaRepository<ClaimOnboarding, Long>{

    List<ClaimOnboarding> findByModeOfIntimation(String modeOfIntimation);
    List<ClaimOnboarding> findByMemberId(String memberId);
    List<ClaimOnboarding> findByPAN(String PAN);
    List<ClaimOnboarding> findByAadhar(String Aadhar);
    List<ClaimOnboarding> findByVoterId(String VoterId);
    List<ClaimOnboarding> findByTypeOfClaim(String typeOfClaim);
    List<ClaimOnboarding> findByReceiptId(String receiptId);
    List<ClaimOnboarding> findByReason(String reason);
    List<ClaimOnboarding> findByDateOfEvent(String dateOfEvent);
    List<ClaimOnboarding> findByCauseOfEvent(String causeOfEvent);
}