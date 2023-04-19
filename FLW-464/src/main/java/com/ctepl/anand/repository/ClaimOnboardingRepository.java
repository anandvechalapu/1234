.

@Repository
public interface ClaimOnboardingRepository extends JpaRepository<ClaimOnboarding, Long> {
	
	List<ClaimOnboarding> findByModeOfIntimation(String modeOfIntimation);
	
	List<ClaimOnboarding> findByMemberId(String memberId);
	
	List<ClaimOnboarding> findByPAN(String pan);
	
	List<ClaimOnboarding> findByAadhar(String aadhar);

	List<ClaimOnboarding> findByVoterId(String voterId);
	
	List<ClaimOnboarding> findByTypeOfClaim(String typeOfClaim);
	
	List<ClaimOnboarding> findByDateOfEvent(Date dateOfEvent);
	
	List<ClaimOnboarding> findByCauseOfEvent(String causeOfEvent);
	
	List<ClaimOnboarding> findByClaimReceptionId(String claimReceptionId);
	
	List<ClaimOnboarding> findByReasonOfNotBeingAccepted(String reasonOfNotBeingAccepted);
	
	List<ClaimOnboarding> findByFurtherProcess(String furtherProcess);
	
}