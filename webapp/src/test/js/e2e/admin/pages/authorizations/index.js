'use strict';

var AuthorizationsPage = require('./authorizations-base');
var ApplicationPage = require('./application');
var AuthorizationPage = require('./authorization');
var GroupPage = require('./group');
var GroupMembershipPage = require('./group-membership');
var UserPage = require('./user');

module.exports = new AuthorizationsPage();
module.exports.application = new ApplicationPage();
module.exports.authorization = new AuthorizationPage();
module.exports.group = new GroupPage();
module.exports.groupMembership = new GroupMembershipPage();
module.exports.user= new UserPage();
