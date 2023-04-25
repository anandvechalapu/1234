/**
 * Controller
 *
 * @description The controller for the CSA setup buyer menu. This controller handles
 * the logic for displaying all functionalities related to buyers, as well as
 * allowing the user to add, edit, or search for buyers.
 */
({
	init: function(component, event, helper) {
		// Load all buyers from the server
		helper.loadBuyers(component);
	},

	showAddBuyerForm: function(component, event, helper) {
		// Show the add buyer form
		component.set("v.showAddBuyerForm", true);
	},

	closeAddBuyerForm: function(component, event, helper) {
		// Hide the add buyer form
		component.set("v.showAddBuyerForm", false);
	},

	saveBuyer: function(component, event, helper) {
		// Save the new buyer
		helper.saveBuyer(component, event);
	},

	editBuyer: function(component, event, helper) {
		// Show the edit buyer form
		component.set("v.showEditBuyerForm", true);

		// Get the buyer to edit
		let buyerId = event.currentTarget.dataset.buyerId;
		let buyers = component.get("v.buyers");

		let buyer = buyers.find(x => x.Id === buyerId);
		component.set("v.buyer", buyer);
	},

	closeEditBuyerForm: function(component, event, helper) {
		// Hide the edit buyer form
		component.set("v.showEditBuyerForm", false);
	},

	updateBuyer: function(component, event, helper) {
		// Update the buyer
		helper.updateBuyer(component, event);
	},

	deleteBuyer: function(component, event, helper) {
		// Delete the buyer
		helper.deleteBuyer(component, event);
	},

	searchBuyer: function(component, event, helper) {
		// Search for the buyer
		helper.searchBuyer(component);
	},

	changePassword: function(component, event, helper) {
		// Verify the account owner
		helper.verifyAccountOwner(component, event);
	},

	openChat: function(component, event, helper) {
		// Open a chat with the customer
		helper.openChat(component, event);
	},

	callCustomer: function(component, event, helper) {
		// Call the customer
		helper.callCustomer(component, event);
	}
})