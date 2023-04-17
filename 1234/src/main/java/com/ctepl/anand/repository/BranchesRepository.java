·       User should be able to access the sub functionalities like create, edit, view and download.·       User should be able to download the branches as format of .csv file.·       No duplicate records should be created.·       All the fields should have validations.

import org.springframework.data.repository.CrudRepository;

public interface BranchesRepository extends CrudRepository<Branches, String> {

    Branches findByWholesalerAndNameAndNumber(String wholesaler, String name, String number);

    List<Branches> findByWholesalerAndNfrnRegionAndTvRegionAndAatSatValues(String wholesaler, String nfrnRegion, String tvRegion, String aatSatValues);

    List<Branches> findByActive(String active);

    List<Branches> findByDateCreated(String dateCreated);

    List<Branches> findByLastModified(String lastModified);

    // Save Method
    Branches save(Branches branches);
    
    // Delete Method
    void delete(Branches branches);
    
    // View Method
    Branches view(Branches branches);
    
    // Download Method
    void download(Branches branches);
}