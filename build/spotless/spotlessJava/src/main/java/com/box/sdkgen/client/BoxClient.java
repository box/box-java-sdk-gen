package com.box.sdkgen.client;

import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import com.box.sdkgen.managers.ai.AiManager;
import com.box.sdkgen.managers.appitemassociations.AppItemAssociationsManager;
import com.box.sdkgen.managers.authorization.AuthorizationManager;
import com.box.sdkgen.managers.avatars.AvatarsManager;
import com.box.sdkgen.managers.chunkeduploads.ChunkedUploadsManager;
import com.box.sdkgen.managers.classifications.ClassificationsManager;
import com.box.sdkgen.managers.collaborationallowlistentries.CollaborationAllowlistEntriesManager;
import com.box.sdkgen.managers.collaborationallowlistexempttargets.CollaborationAllowlistExemptTargetsManager;
import com.box.sdkgen.managers.collections.CollectionsManager;
import com.box.sdkgen.managers.comments.CommentsManager;
import com.box.sdkgen.managers.devicepinners.DevicePinnersManager;
import com.box.sdkgen.managers.downloads.DownloadsManager;
import com.box.sdkgen.managers.emailaliases.EmailAliasesManager;
import com.box.sdkgen.managers.events.EventsManager;
import com.box.sdkgen.managers.fileclassifications.FileClassificationsManager;
import com.box.sdkgen.managers.filemetadata.FileMetadataManager;
import com.box.sdkgen.managers.filerequests.FileRequestsManager;
import com.box.sdkgen.managers.files.FilesManager;
import com.box.sdkgen.managers.fileversionlegalholds.FileVersionLegalHoldsManager;
import com.box.sdkgen.managers.fileversionretentions.FileVersionRetentionsManager;
import com.box.sdkgen.managers.fileversions.FileVersionsManager;
import com.box.sdkgen.managers.filewatermarks.FileWatermarksManager;
import com.box.sdkgen.managers.folderclassifications.FolderClassificationsManager;
import com.box.sdkgen.managers.folderlocks.FolderLocksManager;
import com.box.sdkgen.managers.foldermetadata.FolderMetadataManager;
import com.box.sdkgen.managers.folders.FoldersManager;
import com.box.sdkgen.managers.folderwatermarks.FolderWatermarksManager;
import com.box.sdkgen.managers.groups.GroupsManager;
import com.box.sdkgen.managers.integrationmappings.IntegrationMappingsManager;
import com.box.sdkgen.managers.invites.InvitesManager;
import com.box.sdkgen.managers.legalholdpolicies.LegalHoldPoliciesManager;
import com.box.sdkgen.managers.legalholdpolicyassignments.LegalHoldPolicyAssignmentsManager;
import com.box.sdkgen.managers.listcollaborations.ListCollaborationsManager;
import com.box.sdkgen.managers.memberships.MembershipsManager;
import com.box.sdkgen.managers.metadatacascadepolicies.MetadataCascadePoliciesManager;
import com.box.sdkgen.managers.metadatatemplates.MetadataTemplatesManager;
import com.box.sdkgen.managers.recentitems.RecentItemsManager;
import com.box.sdkgen.managers.retentionpolicies.RetentionPoliciesManager;
import com.box.sdkgen.managers.retentionpolicyassignments.RetentionPolicyAssignmentsManager;
import com.box.sdkgen.managers.search.SearchManager;
import com.box.sdkgen.managers.sessiontermination.SessionTerminationManager;
import com.box.sdkgen.managers.sharedlinksfiles.SharedLinksFilesManager;
import com.box.sdkgen.managers.sharedlinksfolders.SharedLinksFoldersManager;
import com.box.sdkgen.managers.sharedlinksweblinks.SharedLinksWebLinksManager;
import com.box.sdkgen.managers.shieldinformationbarrierreports.ShieldInformationBarrierReportsManager;
import com.box.sdkgen.managers.shieldinformationbarriers.ShieldInformationBarriersManager;
import com.box.sdkgen.managers.shieldinformationbarriersegmentmembers.ShieldInformationBarrierSegmentMembersManager;
import com.box.sdkgen.managers.shieldinformationbarriersegmentrestrictions.ShieldInformationBarrierSegmentRestrictionsManager;
import com.box.sdkgen.managers.shieldinformationbarriersegments.ShieldInformationBarrierSegmentsManager;
import com.box.sdkgen.managers.signrequests.SignRequestsManager;
import com.box.sdkgen.managers.signtemplates.SignTemplatesManager;
import com.box.sdkgen.managers.skills.SkillsManager;
import com.box.sdkgen.managers.storagepolicies.StoragePoliciesManager;
import com.box.sdkgen.managers.storagepolicyassignments.StoragePolicyAssignmentsManager;
import com.box.sdkgen.managers.taskassignments.TaskAssignmentsManager;
import com.box.sdkgen.managers.tasks.TasksManager;
import com.box.sdkgen.managers.termsofservices.TermsOfServicesManager;
import com.box.sdkgen.managers.termsofserviceuserstatuses.TermsOfServiceUserStatusesManager;
import com.box.sdkgen.managers.transfer.TransferManager;
import com.box.sdkgen.managers.trashedfiles.TrashedFilesManager;
import com.box.sdkgen.managers.trashedfolders.TrashedFoldersManager;
import com.box.sdkgen.managers.trasheditems.TrashedItemsManager;
import com.box.sdkgen.managers.trashedweblinks.TrashedWebLinksManager;
import com.box.sdkgen.managers.uploads.UploadsManager;
import com.box.sdkgen.managers.usercollaborations.UserCollaborationsManager;
import com.box.sdkgen.managers.users.UsersManager;
import com.box.sdkgen.managers.webhooks.WebhooksManager;
import com.box.sdkgen.managers.weblinks.WebLinksManager;
import com.box.sdkgen.managers.workflows.WorkflowsManager;
import com.box.sdkgen.managers.zipdownloads.ZipDownloadsManager;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.baseurls.BaseUrls;
import com.box.sdkgen.networking.network.NetworkSession;
import java.util.Map;

public class BoxClient {

  public final Authentication auth;

  public NetworkSession networkSession;

  public final AuthorizationManager authorization;

  public final FilesManager files;

  public final TrashedFilesManager trashedFiles;

  public final AppItemAssociationsManager appItemAssociations;

  public final DownloadsManager downloads;

  public final UploadsManager uploads;

  public final ChunkedUploadsManager chunkedUploads;

  public final ListCollaborationsManager listCollaborations;

  public final CommentsManager comments;

  public final TasksManager tasks;

  public final FileVersionsManager fileVersions;

  public final FileMetadataManager fileMetadata;

  public final FileClassificationsManager fileClassifications;

  public final SkillsManager skills;

  public final FileWatermarksManager fileWatermarks;

  public final FileRequestsManager fileRequests;

  public final FoldersManager folders;

  public final TrashedFoldersManager trashedFolders;

  public final FolderMetadataManager folderMetadata;

  public final FolderClassificationsManager folderClassifications;

  public final TrashedItemsManager trashedItems;

  public final FolderWatermarksManager folderWatermarks;

  public final FolderLocksManager folderLocks;

  public final MetadataTemplatesManager metadataTemplates;

  public final ClassificationsManager classifications;

  public final MetadataCascadePoliciesManager metadataCascadePolicies;

  public final SearchManager search;

  public final UserCollaborationsManager userCollaborations;

  public final TaskAssignmentsManager taskAssignments;

  public final SharedLinksFilesManager sharedLinksFiles;

  public final SharedLinksFoldersManager sharedLinksFolders;

  public final WebLinksManager webLinks;

  public final TrashedWebLinksManager trashedWebLinks;

  public final SharedLinksWebLinksManager sharedLinksWebLinks;

  public final UsersManager users;

  public final SessionTerminationManager sessionTermination;

  public final AvatarsManager avatars;

  public final TransferManager transfer;

  public final EmailAliasesManager emailAliases;

  public final MembershipsManager memberships;

  public final InvitesManager invites;

  public final GroupsManager groups;

  public final WebhooksManager webhooks;

  public final EventsManager events;

  public final CollectionsManager collections;

  public final RecentItemsManager recentItems;

  public final RetentionPoliciesManager retentionPolicies;

  public final RetentionPolicyAssignmentsManager retentionPolicyAssignments;

  public final LegalHoldPoliciesManager legalHoldPolicies;

  public final LegalHoldPolicyAssignmentsManager legalHoldPolicyAssignments;

  public final FileVersionRetentionsManager fileVersionRetentions;

  public final FileVersionLegalHoldsManager fileVersionLegalHolds;

  public final ShieldInformationBarriersManager shieldInformationBarriers;

  public final ShieldInformationBarrierReportsManager shieldInformationBarrierReports;

  public final ShieldInformationBarrierSegmentsManager shieldInformationBarrierSegments;

  public final ShieldInformationBarrierSegmentMembersManager shieldInformationBarrierSegmentMembers;

  public final ShieldInformationBarrierSegmentRestrictionsManager
      shieldInformationBarrierSegmentRestrictions;

  public final DevicePinnersManager devicePinners;

  public final TermsOfServicesManager termsOfServices;

  public final TermsOfServiceUserStatusesManager termsOfServiceUserStatuses;

  public final CollaborationAllowlistEntriesManager collaborationAllowlistEntries;

  public final CollaborationAllowlistExemptTargetsManager collaborationAllowlistExemptTargets;

  public final StoragePoliciesManager storagePolicies;

  public final StoragePolicyAssignmentsManager storagePolicyAssignments;

  public final ZipDownloadsManager zipDownloads;

  public final SignRequestsManager signRequests;

  public final WorkflowsManager workflows;

  public final SignTemplatesManager signTemplates;

  public final IntegrationMappingsManager integrationMappings;

  public final AiManager ai;

  public BoxClient(Authentication auth) {
    this.auth = auth;
    this.networkSession =
        new NetworkSession.NetworkSessionBuilder().baseUrls(new BaseUrls()).build();
    this.authorization =
        new AuthorizationManager.AuthorizationManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.files =
        new FilesManager.FilesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.trashedFiles =
        new TrashedFilesManager.TrashedFilesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.appItemAssociations =
        new AppItemAssociationsManager.AppItemAssociationsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.downloads =
        new DownloadsManager.DownloadsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.uploads =
        new UploadsManager.UploadsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.chunkedUploads =
        new ChunkedUploadsManager.ChunkedUploadsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.listCollaborations =
        new ListCollaborationsManager.ListCollaborationsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.comments =
        new CommentsManager.CommentsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.tasks =
        new TasksManager.TasksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileVersions =
        new FileVersionsManager.FileVersionsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileMetadata =
        new FileMetadataManager.FileMetadataManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileClassifications =
        new FileClassificationsManager.FileClassificationsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.skills =
        new SkillsManager.SkillsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileWatermarks =
        new FileWatermarksManager.FileWatermarksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileRequests =
        new FileRequestsManager.FileRequestsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.folders =
        new FoldersManager.FoldersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.trashedFolders =
        new TrashedFoldersManager.TrashedFoldersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.folderMetadata =
        new FolderMetadataManager.FolderMetadataManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.folderClassifications =
        new FolderClassificationsManager.FolderClassificationsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.trashedItems =
        new TrashedItemsManager.TrashedItemsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.folderWatermarks =
        new FolderWatermarksManager.FolderWatermarksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.folderLocks =
        new FolderLocksManager.FolderLocksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.metadataTemplates =
        new MetadataTemplatesManager.MetadataTemplatesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.classifications =
        new ClassificationsManager.ClassificationsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.metadataCascadePolicies =
        new MetadataCascadePoliciesManager.MetadataCascadePoliciesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.search =
        new SearchManager.SearchManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.userCollaborations =
        new UserCollaborationsManager.UserCollaborationsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.taskAssignments =
        new TaskAssignmentsManager.TaskAssignmentsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.sharedLinksFiles =
        new SharedLinksFilesManager.SharedLinksFilesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.sharedLinksFolders =
        new SharedLinksFoldersManager.SharedLinksFoldersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.webLinks =
        new WebLinksManager.WebLinksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.trashedWebLinks =
        new TrashedWebLinksManager.TrashedWebLinksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.sharedLinksWebLinks =
        new SharedLinksWebLinksManager.SharedLinksWebLinksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.users =
        new UsersManager.UsersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.sessionTermination =
        new SessionTerminationManager.SessionTerminationManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.avatars =
        new AvatarsManager.AvatarsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.transfer =
        new TransferManager.TransferManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.emailAliases =
        new EmailAliasesManager.EmailAliasesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.memberships =
        new MembershipsManager.MembershipsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.invites =
        new InvitesManager.InvitesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.groups =
        new GroupsManager.GroupsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.webhooks =
        new WebhooksManager.WebhooksManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.events =
        new EventsManager.EventsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.collections =
        new CollectionsManager.CollectionsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.recentItems =
        new RecentItemsManager.RecentItemsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.retentionPolicies =
        new RetentionPoliciesManager.RetentionPoliciesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.retentionPolicyAssignments =
        new RetentionPolicyAssignmentsManager.RetentionPolicyAssignmentsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.legalHoldPolicies =
        new LegalHoldPoliciesManager.LegalHoldPoliciesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.legalHoldPolicyAssignments =
        new LegalHoldPolicyAssignmentsManager.LegalHoldPolicyAssignmentsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileVersionRetentions =
        new FileVersionRetentionsManager.FileVersionRetentionsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.fileVersionLegalHolds =
        new FileVersionLegalHoldsManager.FileVersionLegalHoldsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.shieldInformationBarriers =
        new ShieldInformationBarriersManager.ShieldInformationBarriersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.shieldInformationBarrierReports =
        new ShieldInformationBarrierReportsManager.ShieldInformationBarrierReportsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.shieldInformationBarrierSegments =
        new ShieldInformationBarrierSegmentsManager.ShieldInformationBarrierSegmentsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.shieldInformationBarrierSegmentMembers =
        new ShieldInformationBarrierSegmentMembersManager
                .ShieldInformationBarrierSegmentMembersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.shieldInformationBarrierSegmentRestrictions =
        new ShieldInformationBarrierSegmentRestrictionsManager
                .ShieldInformationBarrierSegmentRestrictionsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.devicePinners =
        new DevicePinnersManager.DevicePinnersManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.termsOfServices =
        new TermsOfServicesManager.TermsOfServicesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.termsOfServiceUserStatuses =
        new TermsOfServiceUserStatusesManager.TermsOfServiceUserStatusesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.collaborationAllowlistEntries =
        new CollaborationAllowlistEntriesManager.CollaborationAllowlistEntriesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.collaborationAllowlistExemptTargets =
        new CollaborationAllowlistExemptTargetsManager
                .CollaborationAllowlistExemptTargetsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.storagePolicies =
        new StoragePoliciesManager.StoragePoliciesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.storagePolicyAssignments =
        new StoragePolicyAssignmentsManager.StoragePolicyAssignmentsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.zipDownloads =
        new ZipDownloadsManager.ZipDownloadsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.signRequests =
        new SignRequestsManager.SignRequestsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.workflows =
        new WorkflowsManager.WorkflowsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.signTemplates =
        new SignTemplatesManager.SignTemplatesManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.integrationMappings =
        new IntegrationMappingsManager.IntegrationMappingsManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
    this.ai =
        new AiManager.AiManagerBuilder()
            .auth(this.auth)
            .networkSession(this.networkSession)
            .build();
  }

  protected BoxClient(BoxClientBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
    this.authorization = builder.authorization;
    this.files = builder.files;
    this.trashedFiles = builder.trashedFiles;
    this.appItemAssociations = builder.appItemAssociations;
    this.downloads = builder.downloads;
    this.uploads = builder.uploads;
    this.chunkedUploads = builder.chunkedUploads;
    this.listCollaborations = builder.listCollaborations;
    this.comments = builder.comments;
    this.tasks = builder.tasks;
    this.fileVersions = builder.fileVersions;
    this.fileMetadata = builder.fileMetadata;
    this.fileClassifications = builder.fileClassifications;
    this.skills = builder.skills;
    this.fileWatermarks = builder.fileWatermarks;
    this.fileRequests = builder.fileRequests;
    this.folders = builder.folders;
    this.trashedFolders = builder.trashedFolders;
    this.folderMetadata = builder.folderMetadata;
    this.folderClassifications = builder.folderClassifications;
    this.trashedItems = builder.trashedItems;
    this.folderWatermarks = builder.folderWatermarks;
    this.folderLocks = builder.folderLocks;
    this.metadataTemplates = builder.metadataTemplates;
    this.classifications = builder.classifications;
    this.metadataCascadePolicies = builder.metadataCascadePolicies;
    this.search = builder.search;
    this.userCollaborations = builder.userCollaborations;
    this.taskAssignments = builder.taskAssignments;
    this.sharedLinksFiles = builder.sharedLinksFiles;
    this.sharedLinksFolders = builder.sharedLinksFolders;
    this.webLinks = builder.webLinks;
    this.trashedWebLinks = builder.trashedWebLinks;
    this.sharedLinksWebLinks = builder.sharedLinksWebLinks;
    this.users = builder.users;
    this.sessionTermination = builder.sessionTermination;
    this.avatars = builder.avatars;
    this.transfer = builder.transfer;
    this.emailAliases = builder.emailAliases;
    this.memberships = builder.memberships;
    this.invites = builder.invites;
    this.groups = builder.groups;
    this.webhooks = builder.webhooks;
    this.events = builder.events;
    this.collections = builder.collections;
    this.recentItems = builder.recentItems;
    this.retentionPolicies = builder.retentionPolicies;
    this.retentionPolicyAssignments = builder.retentionPolicyAssignments;
    this.legalHoldPolicies = builder.legalHoldPolicies;
    this.legalHoldPolicyAssignments = builder.legalHoldPolicyAssignments;
    this.fileVersionRetentions = builder.fileVersionRetentions;
    this.fileVersionLegalHolds = builder.fileVersionLegalHolds;
    this.shieldInformationBarriers = builder.shieldInformationBarriers;
    this.shieldInformationBarrierReports = builder.shieldInformationBarrierReports;
    this.shieldInformationBarrierSegments = builder.shieldInformationBarrierSegments;
    this.shieldInformationBarrierSegmentMembers = builder.shieldInformationBarrierSegmentMembers;
    this.shieldInformationBarrierSegmentRestrictions =
        builder.shieldInformationBarrierSegmentRestrictions;
    this.devicePinners = builder.devicePinners;
    this.termsOfServices = builder.termsOfServices;
    this.termsOfServiceUserStatuses = builder.termsOfServiceUserStatuses;
    this.collaborationAllowlistEntries = builder.collaborationAllowlistEntries;
    this.collaborationAllowlistExemptTargets = builder.collaborationAllowlistExemptTargets;
    this.storagePolicies = builder.storagePolicies;
    this.storagePolicyAssignments = builder.storagePolicyAssignments;
    this.zipDownloads = builder.zipDownloads;
    this.signRequests = builder.signRequests;
    this.workflows = builder.workflows;
    this.signTemplates = builder.signTemplates;
    this.integrationMappings = builder.integrationMappings;
    this.ai = builder.ai;
  }

  public BoxClient withAsUserHeader(String userId) {
    return new BoxClient.BoxClientBuilder(this.auth)
        .networkSession(
            this.networkSession.withAdditionalHeaders(mapOf(entryOf("As-User", userId))))
        .build();
  }

  public BoxClient withSuppressedNotifications() {
    return new BoxClient.BoxClientBuilder(this.auth)
        .networkSession(
            this.networkSession.withAdditionalHeaders(mapOf(entryOf("Box-Notifications", "off"))))
        .build();
  }

  public BoxClient withExtraHeaders() {
    return withExtraHeaders(mapOf());
  }

  public BoxClient withExtraHeaders(Map<String, String> extraHeaders) {
    return new BoxClient.BoxClientBuilder(this.auth)
        .networkSession(this.networkSession.withAdditionalHeaders(extraHeaders))
        .build();
  }

  public BoxClient withCustomBaseUrls(BaseUrls baseUrls) {
    return new BoxClient.BoxClientBuilder(this.auth)
        .networkSession(this.networkSession.withCustomBaseUrls(baseUrls))
        .build();
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public AuthorizationManager getAuthorization() {
    return authorization;
  }

  public FilesManager getFiles() {
    return files;
  }

  public TrashedFilesManager getTrashedFiles() {
    return trashedFiles;
  }

  public AppItemAssociationsManager getAppItemAssociations() {
    return appItemAssociations;
  }

  public DownloadsManager getDownloads() {
    return downloads;
  }

  public UploadsManager getUploads() {
    return uploads;
  }

  public ChunkedUploadsManager getChunkedUploads() {
    return chunkedUploads;
  }

  public ListCollaborationsManager getListCollaborations() {
    return listCollaborations;
  }

  public CommentsManager getComments() {
    return comments;
  }

  public TasksManager getTasks() {
    return tasks;
  }

  public FileVersionsManager getFileVersions() {
    return fileVersions;
  }

  public FileMetadataManager getFileMetadata() {
    return fileMetadata;
  }

  public FileClassificationsManager getFileClassifications() {
    return fileClassifications;
  }

  public SkillsManager getSkills() {
    return skills;
  }

  public FileWatermarksManager getFileWatermarks() {
    return fileWatermarks;
  }

  public FileRequestsManager getFileRequests() {
    return fileRequests;
  }

  public FoldersManager getFolders() {
    return folders;
  }

  public TrashedFoldersManager getTrashedFolders() {
    return trashedFolders;
  }

  public FolderMetadataManager getFolderMetadata() {
    return folderMetadata;
  }

  public FolderClassificationsManager getFolderClassifications() {
    return folderClassifications;
  }

  public TrashedItemsManager getTrashedItems() {
    return trashedItems;
  }

  public FolderWatermarksManager getFolderWatermarks() {
    return folderWatermarks;
  }

  public FolderLocksManager getFolderLocks() {
    return folderLocks;
  }

  public MetadataTemplatesManager getMetadataTemplates() {
    return metadataTemplates;
  }

  public ClassificationsManager getClassifications() {
    return classifications;
  }

  public MetadataCascadePoliciesManager getMetadataCascadePolicies() {
    return metadataCascadePolicies;
  }

  public SearchManager getSearch() {
    return search;
  }

  public UserCollaborationsManager getUserCollaborations() {
    return userCollaborations;
  }

  public TaskAssignmentsManager getTaskAssignments() {
    return taskAssignments;
  }

  public SharedLinksFilesManager getSharedLinksFiles() {
    return sharedLinksFiles;
  }

  public SharedLinksFoldersManager getSharedLinksFolders() {
    return sharedLinksFolders;
  }

  public WebLinksManager getWebLinks() {
    return webLinks;
  }

  public TrashedWebLinksManager getTrashedWebLinks() {
    return trashedWebLinks;
  }

  public SharedLinksWebLinksManager getSharedLinksWebLinks() {
    return sharedLinksWebLinks;
  }

  public UsersManager getUsers() {
    return users;
  }

  public SessionTerminationManager getSessionTermination() {
    return sessionTermination;
  }

  public AvatarsManager getAvatars() {
    return avatars;
  }

  public TransferManager getTransfer() {
    return transfer;
  }

  public EmailAliasesManager getEmailAliases() {
    return emailAliases;
  }

  public MembershipsManager getMemberships() {
    return memberships;
  }

  public InvitesManager getInvites() {
    return invites;
  }

  public GroupsManager getGroups() {
    return groups;
  }

  public WebhooksManager getWebhooks() {
    return webhooks;
  }

  public EventsManager getEvents() {
    return events;
  }

  public CollectionsManager getCollections() {
    return collections;
  }

  public RecentItemsManager getRecentItems() {
    return recentItems;
  }

  public RetentionPoliciesManager getRetentionPolicies() {
    return retentionPolicies;
  }

  public RetentionPolicyAssignmentsManager getRetentionPolicyAssignments() {
    return retentionPolicyAssignments;
  }

  public LegalHoldPoliciesManager getLegalHoldPolicies() {
    return legalHoldPolicies;
  }

  public LegalHoldPolicyAssignmentsManager getLegalHoldPolicyAssignments() {
    return legalHoldPolicyAssignments;
  }

  public FileVersionRetentionsManager getFileVersionRetentions() {
    return fileVersionRetentions;
  }

  public FileVersionLegalHoldsManager getFileVersionLegalHolds() {
    return fileVersionLegalHolds;
  }

  public ShieldInformationBarriersManager getShieldInformationBarriers() {
    return shieldInformationBarriers;
  }

  public ShieldInformationBarrierReportsManager getShieldInformationBarrierReports() {
    return shieldInformationBarrierReports;
  }

  public ShieldInformationBarrierSegmentsManager getShieldInformationBarrierSegments() {
    return shieldInformationBarrierSegments;
  }

  public ShieldInformationBarrierSegmentMembersManager getShieldInformationBarrierSegmentMembers() {
    return shieldInformationBarrierSegmentMembers;
  }

  public ShieldInformationBarrierSegmentRestrictionsManager
      getShieldInformationBarrierSegmentRestrictions() {
    return shieldInformationBarrierSegmentRestrictions;
  }

  public DevicePinnersManager getDevicePinners() {
    return devicePinners;
  }

  public TermsOfServicesManager getTermsOfServices() {
    return termsOfServices;
  }

  public TermsOfServiceUserStatusesManager getTermsOfServiceUserStatuses() {
    return termsOfServiceUserStatuses;
  }

  public CollaborationAllowlistEntriesManager getCollaborationAllowlistEntries() {
    return collaborationAllowlistEntries;
  }

  public CollaborationAllowlistExemptTargetsManager getCollaborationAllowlistExemptTargets() {
    return collaborationAllowlistExemptTargets;
  }

  public StoragePoliciesManager getStoragePolicies() {
    return storagePolicies;
  }

  public StoragePolicyAssignmentsManager getStoragePolicyAssignments() {
    return storagePolicyAssignments;
  }

  public ZipDownloadsManager getZipDownloads() {
    return zipDownloads;
  }

  public SignRequestsManager getSignRequests() {
    return signRequests;
  }

  public WorkflowsManager getWorkflows() {
    return workflows;
  }

  public SignTemplatesManager getSignTemplates() {
    return signTemplates;
  }

  public IntegrationMappingsManager getIntegrationMappings() {
    return integrationMappings;
  }

  public AiManager getAi() {
    return ai;
  }

  public static class BoxClientBuilder {

    protected final Authentication auth;

    protected NetworkSession networkSession;

    protected AuthorizationManager authorization;

    protected FilesManager files;

    protected TrashedFilesManager trashedFiles;

    protected AppItemAssociationsManager appItemAssociations;

    protected DownloadsManager downloads;

    protected UploadsManager uploads;

    protected ChunkedUploadsManager chunkedUploads;

    protected ListCollaborationsManager listCollaborations;

    protected CommentsManager comments;

    protected TasksManager tasks;

    protected FileVersionsManager fileVersions;

    protected FileMetadataManager fileMetadata;

    protected FileClassificationsManager fileClassifications;

    protected SkillsManager skills;

    protected FileWatermarksManager fileWatermarks;

    protected FileRequestsManager fileRequests;

    protected FoldersManager folders;

    protected TrashedFoldersManager trashedFolders;

    protected FolderMetadataManager folderMetadata;

    protected FolderClassificationsManager folderClassifications;

    protected TrashedItemsManager trashedItems;

    protected FolderWatermarksManager folderWatermarks;

    protected FolderLocksManager folderLocks;

    protected MetadataTemplatesManager metadataTemplates;

    protected ClassificationsManager classifications;

    protected MetadataCascadePoliciesManager metadataCascadePolicies;

    protected SearchManager search;

    protected UserCollaborationsManager userCollaborations;

    protected TaskAssignmentsManager taskAssignments;

    protected SharedLinksFilesManager sharedLinksFiles;

    protected SharedLinksFoldersManager sharedLinksFolders;

    protected WebLinksManager webLinks;

    protected TrashedWebLinksManager trashedWebLinks;

    protected SharedLinksWebLinksManager sharedLinksWebLinks;

    protected UsersManager users;

    protected SessionTerminationManager sessionTermination;

    protected AvatarsManager avatars;

    protected TransferManager transfer;

    protected EmailAliasesManager emailAliases;

    protected MembershipsManager memberships;

    protected InvitesManager invites;

    protected GroupsManager groups;

    protected WebhooksManager webhooks;

    protected EventsManager events;

    protected CollectionsManager collections;

    protected RecentItemsManager recentItems;

    protected RetentionPoliciesManager retentionPolicies;

    protected RetentionPolicyAssignmentsManager retentionPolicyAssignments;

    protected LegalHoldPoliciesManager legalHoldPolicies;

    protected LegalHoldPolicyAssignmentsManager legalHoldPolicyAssignments;

    protected FileVersionRetentionsManager fileVersionRetentions;

    protected FileVersionLegalHoldsManager fileVersionLegalHolds;

    protected ShieldInformationBarriersManager shieldInformationBarriers;

    protected ShieldInformationBarrierReportsManager shieldInformationBarrierReports;

    protected ShieldInformationBarrierSegmentsManager shieldInformationBarrierSegments;

    protected ShieldInformationBarrierSegmentMembersManager shieldInformationBarrierSegmentMembers;

    protected ShieldInformationBarrierSegmentRestrictionsManager
        shieldInformationBarrierSegmentRestrictions;

    protected DevicePinnersManager devicePinners;

    protected TermsOfServicesManager termsOfServices;

    protected TermsOfServiceUserStatusesManager termsOfServiceUserStatuses;

    protected CollaborationAllowlistEntriesManager collaborationAllowlistEntries;

    protected CollaborationAllowlistExemptTargetsManager collaborationAllowlistExemptTargets;

    protected StoragePoliciesManager storagePolicies;

    protected StoragePolicyAssignmentsManager storagePolicyAssignments;

    protected ZipDownloadsManager zipDownloads;

    protected SignRequestsManager signRequests;

    protected WorkflowsManager workflows;

    protected SignTemplatesManager signTemplates;

    protected IntegrationMappingsManager integrationMappings;

    protected AiManager ai;

    public BoxClientBuilder(Authentication auth) {
      this.auth = auth;
      this.networkSession =
          new NetworkSession.NetworkSessionBuilder().baseUrls(new BaseUrls()).build();
      this.authorization =
          new AuthorizationManager.AuthorizationManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.files =
          new FilesManager.FilesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.trashedFiles =
          new TrashedFilesManager.TrashedFilesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.appItemAssociations =
          new AppItemAssociationsManager.AppItemAssociationsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.downloads =
          new DownloadsManager.DownloadsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.uploads =
          new UploadsManager.UploadsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.chunkedUploads =
          new ChunkedUploadsManager.ChunkedUploadsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.listCollaborations =
          new ListCollaborationsManager.ListCollaborationsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.comments =
          new CommentsManager.CommentsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.tasks =
          new TasksManager.TasksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileVersions =
          new FileVersionsManager.FileVersionsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileMetadata =
          new FileMetadataManager.FileMetadataManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileClassifications =
          new FileClassificationsManager.FileClassificationsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.skills =
          new SkillsManager.SkillsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileWatermarks =
          new FileWatermarksManager.FileWatermarksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileRequests =
          new FileRequestsManager.FileRequestsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.folders =
          new FoldersManager.FoldersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.trashedFolders =
          new TrashedFoldersManager.TrashedFoldersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.folderMetadata =
          new FolderMetadataManager.FolderMetadataManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.folderClassifications =
          new FolderClassificationsManager.FolderClassificationsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.trashedItems =
          new TrashedItemsManager.TrashedItemsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.folderWatermarks =
          new FolderWatermarksManager.FolderWatermarksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.folderLocks =
          new FolderLocksManager.FolderLocksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.metadataTemplates =
          new MetadataTemplatesManager.MetadataTemplatesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.classifications =
          new ClassificationsManager.ClassificationsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.metadataCascadePolicies =
          new MetadataCascadePoliciesManager.MetadataCascadePoliciesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.search =
          new SearchManager.SearchManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.userCollaborations =
          new UserCollaborationsManager.UserCollaborationsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.taskAssignments =
          new TaskAssignmentsManager.TaskAssignmentsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.sharedLinksFiles =
          new SharedLinksFilesManager.SharedLinksFilesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.sharedLinksFolders =
          new SharedLinksFoldersManager.SharedLinksFoldersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.webLinks =
          new WebLinksManager.WebLinksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.trashedWebLinks =
          new TrashedWebLinksManager.TrashedWebLinksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.sharedLinksWebLinks =
          new SharedLinksWebLinksManager.SharedLinksWebLinksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.users =
          new UsersManager.UsersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.sessionTermination =
          new SessionTerminationManager.SessionTerminationManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.avatars =
          new AvatarsManager.AvatarsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.transfer =
          new TransferManager.TransferManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.emailAliases =
          new EmailAliasesManager.EmailAliasesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.memberships =
          new MembershipsManager.MembershipsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.invites =
          new InvitesManager.InvitesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.groups =
          new GroupsManager.GroupsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.webhooks =
          new WebhooksManager.WebhooksManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.events =
          new EventsManager.EventsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.collections =
          new CollectionsManager.CollectionsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.recentItems =
          new RecentItemsManager.RecentItemsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.retentionPolicies =
          new RetentionPoliciesManager.RetentionPoliciesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.retentionPolicyAssignments =
          new RetentionPolicyAssignmentsManager.RetentionPolicyAssignmentsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.legalHoldPolicies =
          new LegalHoldPoliciesManager.LegalHoldPoliciesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.legalHoldPolicyAssignments =
          new LegalHoldPolicyAssignmentsManager.LegalHoldPolicyAssignmentsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileVersionRetentions =
          new FileVersionRetentionsManager.FileVersionRetentionsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.fileVersionLegalHolds =
          new FileVersionLegalHoldsManager.FileVersionLegalHoldsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.shieldInformationBarriers =
          new ShieldInformationBarriersManager.ShieldInformationBarriersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.shieldInformationBarrierReports =
          new ShieldInformationBarrierReportsManager.ShieldInformationBarrierReportsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.shieldInformationBarrierSegments =
          new ShieldInformationBarrierSegmentsManager
                  .ShieldInformationBarrierSegmentsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.shieldInformationBarrierSegmentMembers =
          new ShieldInformationBarrierSegmentMembersManager
                  .ShieldInformationBarrierSegmentMembersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.shieldInformationBarrierSegmentRestrictions =
          new ShieldInformationBarrierSegmentRestrictionsManager
                  .ShieldInformationBarrierSegmentRestrictionsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.devicePinners =
          new DevicePinnersManager.DevicePinnersManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.termsOfServices =
          new TermsOfServicesManager.TermsOfServicesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.termsOfServiceUserStatuses =
          new TermsOfServiceUserStatusesManager.TermsOfServiceUserStatusesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.collaborationAllowlistEntries =
          new CollaborationAllowlistEntriesManager.CollaborationAllowlistEntriesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.collaborationAllowlistExemptTargets =
          new CollaborationAllowlistExemptTargetsManager
                  .CollaborationAllowlistExemptTargetsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.storagePolicies =
          new StoragePoliciesManager.StoragePoliciesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.storagePolicyAssignments =
          new StoragePolicyAssignmentsManager.StoragePolicyAssignmentsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.zipDownloads =
          new ZipDownloadsManager.ZipDownloadsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.signRequests =
          new SignRequestsManager.SignRequestsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.workflows =
          new WorkflowsManager.WorkflowsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.signTemplates =
          new SignTemplatesManager.SignTemplatesManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.integrationMappings =
          new IntegrationMappingsManager.IntegrationMappingsManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
      this.ai =
          new AiManager.AiManagerBuilder()
              .auth(this.auth)
              .networkSession(this.networkSession)
              .build();
    }

    public BoxClientBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public BoxClientBuilder authorization(AuthorizationManager authorization) {
      this.authorization = authorization;
      return this;
    }

    public BoxClientBuilder files(FilesManager files) {
      this.files = files;
      return this;
    }

    public BoxClientBuilder trashedFiles(TrashedFilesManager trashedFiles) {
      this.trashedFiles = trashedFiles;
      return this;
    }

    public BoxClientBuilder appItemAssociations(AppItemAssociationsManager appItemAssociations) {
      this.appItemAssociations = appItemAssociations;
      return this;
    }

    public BoxClientBuilder downloads(DownloadsManager downloads) {
      this.downloads = downloads;
      return this;
    }

    public BoxClientBuilder uploads(UploadsManager uploads) {
      this.uploads = uploads;
      return this;
    }

    public BoxClientBuilder chunkedUploads(ChunkedUploadsManager chunkedUploads) {
      this.chunkedUploads = chunkedUploads;
      return this;
    }

    public BoxClientBuilder listCollaborations(ListCollaborationsManager listCollaborations) {
      this.listCollaborations = listCollaborations;
      return this;
    }

    public BoxClientBuilder comments(CommentsManager comments) {
      this.comments = comments;
      return this;
    }

    public BoxClientBuilder tasks(TasksManager tasks) {
      this.tasks = tasks;
      return this;
    }

    public BoxClientBuilder fileVersions(FileVersionsManager fileVersions) {
      this.fileVersions = fileVersions;
      return this;
    }

    public BoxClientBuilder fileMetadata(FileMetadataManager fileMetadata) {
      this.fileMetadata = fileMetadata;
      return this;
    }

    public BoxClientBuilder fileClassifications(FileClassificationsManager fileClassifications) {
      this.fileClassifications = fileClassifications;
      return this;
    }

    public BoxClientBuilder skills(SkillsManager skills) {
      this.skills = skills;
      return this;
    }

    public BoxClientBuilder fileWatermarks(FileWatermarksManager fileWatermarks) {
      this.fileWatermarks = fileWatermarks;
      return this;
    }

    public BoxClientBuilder fileRequests(FileRequestsManager fileRequests) {
      this.fileRequests = fileRequests;
      return this;
    }

    public BoxClientBuilder folders(FoldersManager folders) {
      this.folders = folders;
      return this;
    }

    public BoxClientBuilder trashedFolders(TrashedFoldersManager trashedFolders) {
      this.trashedFolders = trashedFolders;
      return this;
    }

    public BoxClientBuilder folderMetadata(FolderMetadataManager folderMetadata) {
      this.folderMetadata = folderMetadata;
      return this;
    }

    public BoxClientBuilder folderClassifications(
        FolderClassificationsManager folderClassifications) {
      this.folderClassifications = folderClassifications;
      return this;
    }

    public BoxClientBuilder trashedItems(TrashedItemsManager trashedItems) {
      this.trashedItems = trashedItems;
      return this;
    }

    public BoxClientBuilder folderWatermarks(FolderWatermarksManager folderWatermarks) {
      this.folderWatermarks = folderWatermarks;
      return this;
    }

    public BoxClientBuilder folderLocks(FolderLocksManager folderLocks) {
      this.folderLocks = folderLocks;
      return this;
    }

    public BoxClientBuilder metadataTemplates(MetadataTemplatesManager metadataTemplates) {
      this.metadataTemplates = metadataTemplates;
      return this;
    }

    public BoxClientBuilder classifications(ClassificationsManager classifications) {
      this.classifications = classifications;
      return this;
    }

    public BoxClientBuilder metadataCascadePolicies(
        MetadataCascadePoliciesManager metadataCascadePolicies) {
      this.metadataCascadePolicies = metadataCascadePolicies;
      return this;
    }

    public BoxClientBuilder search(SearchManager search) {
      this.search = search;
      return this;
    }

    public BoxClientBuilder userCollaborations(UserCollaborationsManager userCollaborations) {
      this.userCollaborations = userCollaborations;
      return this;
    }

    public BoxClientBuilder taskAssignments(TaskAssignmentsManager taskAssignments) {
      this.taskAssignments = taskAssignments;
      return this;
    }

    public BoxClientBuilder sharedLinksFiles(SharedLinksFilesManager sharedLinksFiles) {
      this.sharedLinksFiles = sharedLinksFiles;
      return this;
    }

    public BoxClientBuilder sharedLinksFolders(SharedLinksFoldersManager sharedLinksFolders) {
      this.sharedLinksFolders = sharedLinksFolders;
      return this;
    }

    public BoxClientBuilder webLinks(WebLinksManager webLinks) {
      this.webLinks = webLinks;
      return this;
    }

    public BoxClientBuilder trashedWebLinks(TrashedWebLinksManager trashedWebLinks) {
      this.trashedWebLinks = trashedWebLinks;
      return this;
    }

    public BoxClientBuilder sharedLinksWebLinks(SharedLinksWebLinksManager sharedLinksWebLinks) {
      this.sharedLinksWebLinks = sharedLinksWebLinks;
      return this;
    }

    public BoxClientBuilder users(UsersManager users) {
      this.users = users;
      return this;
    }

    public BoxClientBuilder sessionTermination(SessionTerminationManager sessionTermination) {
      this.sessionTermination = sessionTermination;
      return this;
    }

    public BoxClientBuilder avatars(AvatarsManager avatars) {
      this.avatars = avatars;
      return this;
    }

    public BoxClientBuilder transfer(TransferManager transfer) {
      this.transfer = transfer;
      return this;
    }

    public BoxClientBuilder emailAliases(EmailAliasesManager emailAliases) {
      this.emailAliases = emailAliases;
      return this;
    }

    public BoxClientBuilder memberships(MembershipsManager memberships) {
      this.memberships = memberships;
      return this;
    }

    public BoxClientBuilder invites(InvitesManager invites) {
      this.invites = invites;
      return this;
    }

    public BoxClientBuilder groups(GroupsManager groups) {
      this.groups = groups;
      return this;
    }

    public BoxClientBuilder webhooks(WebhooksManager webhooks) {
      this.webhooks = webhooks;
      return this;
    }

    public BoxClientBuilder events(EventsManager events) {
      this.events = events;
      return this;
    }

    public BoxClientBuilder collections(CollectionsManager collections) {
      this.collections = collections;
      return this;
    }

    public BoxClientBuilder recentItems(RecentItemsManager recentItems) {
      this.recentItems = recentItems;
      return this;
    }

    public BoxClientBuilder retentionPolicies(RetentionPoliciesManager retentionPolicies) {
      this.retentionPolicies = retentionPolicies;
      return this;
    }

    public BoxClientBuilder retentionPolicyAssignments(
        RetentionPolicyAssignmentsManager retentionPolicyAssignments) {
      this.retentionPolicyAssignments = retentionPolicyAssignments;
      return this;
    }

    public BoxClientBuilder legalHoldPolicies(LegalHoldPoliciesManager legalHoldPolicies) {
      this.legalHoldPolicies = legalHoldPolicies;
      return this;
    }

    public BoxClientBuilder legalHoldPolicyAssignments(
        LegalHoldPolicyAssignmentsManager legalHoldPolicyAssignments) {
      this.legalHoldPolicyAssignments = legalHoldPolicyAssignments;
      return this;
    }

    public BoxClientBuilder fileVersionRetentions(
        FileVersionRetentionsManager fileVersionRetentions) {
      this.fileVersionRetentions = fileVersionRetentions;
      return this;
    }

    public BoxClientBuilder fileVersionLegalHolds(
        FileVersionLegalHoldsManager fileVersionLegalHolds) {
      this.fileVersionLegalHolds = fileVersionLegalHolds;
      return this;
    }

    public BoxClientBuilder shieldInformationBarriers(
        ShieldInformationBarriersManager shieldInformationBarriers) {
      this.shieldInformationBarriers = shieldInformationBarriers;
      return this;
    }

    public BoxClientBuilder shieldInformationBarrierReports(
        ShieldInformationBarrierReportsManager shieldInformationBarrierReports) {
      this.shieldInformationBarrierReports = shieldInformationBarrierReports;
      return this;
    }

    public BoxClientBuilder shieldInformationBarrierSegments(
        ShieldInformationBarrierSegmentsManager shieldInformationBarrierSegments) {
      this.shieldInformationBarrierSegments = shieldInformationBarrierSegments;
      return this;
    }

    public BoxClientBuilder shieldInformationBarrierSegmentMembers(
        ShieldInformationBarrierSegmentMembersManager shieldInformationBarrierSegmentMembers) {
      this.shieldInformationBarrierSegmentMembers = shieldInformationBarrierSegmentMembers;
      return this;
    }

    public BoxClientBuilder shieldInformationBarrierSegmentRestrictions(
        ShieldInformationBarrierSegmentRestrictionsManager
            shieldInformationBarrierSegmentRestrictions) {
      this.shieldInformationBarrierSegmentRestrictions =
          shieldInformationBarrierSegmentRestrictions;
      return this;
    }

    public BoxClientBuilder devicePinners(DevicePinnersManager devicePinners) {
      this.devicePinners = devicePinners;
      return this;
    }

    public BoxClientBuilder termsOfServices(TermsOfServicesManager termsOfServices) {
      this.termsOfServices = termsOfServices;
      return this;
    }

    public BoxClientBuilder termsOfServiceUserStatuses(
        TermsOfServiceUserStatusesManager termsOfServiceUserStatuses) {
      this.termsOfServiceUserStatuses = termsOfServiceUserStatuses;
      return this;
    }

    public BoxClientBuilder collaborationAllowlistEntries(
        CollaborationAllowlistEntriesManager collaborationAllowlistEntries) {
      this.collaborationAllowlistEntries = collaborationAllowlistEntries;
      return this;
    }

    public BoxClientBuilder collaborationAllowlistExemptTargets(
        CollaborationAllowlistExemptTargetsManager collaborationAllowlistExemptTargets) {
      this.collaborationAllowlistExemptTargets = collaborationAllowlistExemptTargets;
      return this;
    }

    public BoxClientBuilder storagePolicies(StoragePoliciesManager storagePolicies) {
      this.storagePolicies = storagePolicies;
      return this;
    }

    public BoxClientBuilder storagePolicyAssignments(
        StoragePolicyAssignmentsManager storagePolicyAssignments) {
      this.storagePolicyAssignments = storagePolicyAssignments;
      return this;
    }

    public BoxClientBuilder zipDownloads(ZipDownloadsManager zipDownloads) {
      this.zipDownloads = zipDownloads;
      return this;
    }

    public BoxClientBuilder signRequests(SignRequestsManager signRequests) {
      this.signRequests = signRequests;
      return this;
    }

    public BoxClientBuilder workflows(WorkflowsManager workflows) {
      this.workflows = workflows;
      return this;
    }

    public BoxClientBuilder signTemplates(SignTemplatesManager signTemplates) {
      this.signTemplates = signTemplates;
      return this;
    }

    public BoxClientBuilder integrationMappings(IntegrationMappingsManager integrationMappings) {
      this.integrationMappings = integrationMappings;
      return this;
    }

    public BoxClientBuilder ai(AiManager ai) {
      this.ai = ai;
      return this;
    }

    public BoxClient build() {
      return new BoxClient(this);
    }
  }
}
