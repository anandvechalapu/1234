// Aura Component
<aura:component implements="flexipage:availableForAllPageTypes">
    <aura:handler name="init" value="{!this}" action="{!c.doInit}"/>
    
    <aura:attribute name="setupBuyerMenu" type="List" default="[
        {label: 'Account Number', value: 'accountNumber'},
        {label: 'Load all Buyer', value: 'loadAllBuyer'},
        {label: 'Search', value: 'search'}
    ]" />
    
    <aura:attribute name="buyerInfo" type="Object" default="{
        Title: '',
        FirstName: '',
        LastName: '',
        LoginId: '',
        Email: '',
        Password: '',
        ConfirmPassword: '',
        PhoneNumber: '',
        MobileNumber: '',
        NewsSpreadAccountNumber: '',
        RetailerName: '',
        Address1: '',
        Address2: '',
        Address3: ''
    }"/>
    
    <aura:attribute name="buyers" type="List" default="[]"/>
    
    <aura:attribute name="buyerColumns" type="List" default="[
        {label: 'Login ID', fieldName: 'LoginId', type: 'text'},
        {label: 'Buyer Name', fieldName: 'FirstName', type: 'text'},
        {label: 'Account Number', fieldName: 'NewsSpreadAccountNumber', type: 'text'},
        {label: 'Retailer Name', fieldName: 'RetailerName', type: 'text'},
        {label: 'Email Address', fieldName: 'Email', type: 'text'}
    ]"/>
    
    <lightning:tabset>
        <lightning:tab label="Setup Buyer Menu">
            <lightning:buttonVariant variant="brand" label="Add Buyer" onclick="{!c.addBuyer}" />
            <lightning:buttonVariant variant="brand" label="Edit Buyer" onclick="{!c.editBuyer}" />
            <lightning:buttonVariant variant="brand" label="Save" onclick="{!c.saveBuyer}" />
            <lightning:buttonVariant variant="brand" label="Cancel" onclick="{!c.cancelBuyer}" />
            <lightning:buttonVariant variant="brand" label="Search" onclick="{!c.searchBuyer}" />
            <lightning:buttonVariant variant="brand" label="Change Password" onclick="{!c.changePassword}" />
            <lightning:buttonVariant variant="brand" label="Chat/ Call" onclick="{!c.chatCall}" />
            <lightning:datatable data="{!v.setupBuyerMenu}" columns="{!v.buyerColumns}" keyField="value"/>
        </lightning:tab>
        <lightning:tab label="Buyer List">
            <lightning:datatable data="{!v.buyers}" columns="{!v.buyerColumns}" keyField="value"/>
        </lightning:tab>
    </lightning:tabset>

</aura:component>

// Controller
({
    doInit: function(component, event, helper) {
        
    },
    
    addBuyer: function(component, event, helper) {
        // Logic for adding a new buyer
    },
    
    editBuyer: function(component, event, helper) {
        // Logic for editing an existing buyer
    },
    
    saveBuyer: function(component, event, helper) {
        // Logic for saving a buyer
    },
    
    cancelBuyer: function(component, event, helper) {
        // Logic for canceling a buyer
    },
    
    searchBuyer: function(component, event, helper) {
        // Logic for searching a buyer
    },
    
    changePassword: function(component, event, helper) {
        // Logic for changing a password
    },
    
    chatCall: function(component, event, helper) {
        // Logic for initiating a chat or call
    }
    
})