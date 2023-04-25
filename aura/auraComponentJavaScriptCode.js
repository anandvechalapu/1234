//Aura component JavaScript code
({
    
    doInit : function(component, event, helper) {
        //Fetch buyer details
        helper.fetchBuyerDetails(component);
    },
    
    handleSearch : function(component, event, helper) {
        //Get the search keyword
        var searchKeyword = component.find("searchKeyword").get("v.value");
        //Call the helper function to search buyers
        helper.searchBuyers(component, searchKeyword);
    },
    
    handleAddEditBuyer : function(component, event, helper) {
        //Call the helper function to open the add/edit buyer window
        helper.openAddEditBuyerWindow(component, event);
    },
    
    handleSaveBuyer : function(component, event, helper) {
        //Call the helper function to save the buyer details
        helper.saveBuyerDetails(component);
    },
    
    handleCancelBuyer : function(component, event, helper) {
        //Call the helper function to cancel the add/edit window
        helper.closeAddEditBuyerWindow(component);
    },
    
    handleChangePassword : function(component, event, helper) {
        //Call the helper function to change the password
        helper.changePassword(component);
    },
    
    handleSort : function(component, event, helper) {
        //Call the helper function to sort the buyer list
        helper.sortBuyers(component, event);
    },
    
    handleFilter : function(component, event, helper) {
        //Call the helper function to filter the buyer list
        helper.filterBuyers(component);
    },
    
    handlePageChange : function(component, event, helper) {
        //Call the helper function to paginate the buyer list
        helper.paginateBuyers(component, event);
    },
    
    handleChatCall : function(component, event, helper) {
        //Call the helper function to open the chat/call window
        helper.openChatCallWindow(component);
    }
})