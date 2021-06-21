package com.example.aislechallenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ProfileModel {

    @SerializedName("invites")
    @Expose
    private Invites invites;
    @SerializedName("likes")
    @Expose
    private Likes likes;

    public Invites getInvites() {
        return invites;
    }

    public void setInvites(Invites invites) {
        this.invites = invites;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public class Likes {

        @SerializedName("profiles")
        @Expose
        private List<Profile__1> profiles = null;
        @SerializedName("can_see_profile")
        @Expose
        private Boolean canSeeProfile;
        @SerializedName("likes_received_count")
        @Expose
        private Integer likesReceivedCount;

        public List<Profile__1> getProfiles() {
            return profiles;
        }

        public void setProfiles(List<Profile__1> profiles) {
            this.profiles = profiles;
        }

        public Boolean getCanSeeProfile() {
            return canSeeProfile;
        }

        public void setCanSeeProfile(Boolean canSeeProfile) {
            this.canSeeProfile = canSeeProfile;
        }

        public Integer getLikesReceivedCount() {
            return likesReceivedCount;
        }

        public void setLikesReceivedCount(Integer likesReceivedCount) {
            this.likesReceivedCount = likesReceivedCount;
        }

        public class Profile__1 {

            @SerializedName("first_name")
            @Expose
            private String firstName;
            @SerializedName("avatar")
            @Expose
            private String avatar;

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

        }

    }

    public class Invites {

        @SerializedName("profiles")
        @Expose
        private List<Profile> profiles = null;
        @SerializedName("totalPages")
        @Expose
        private Integer totalPages;
        @SerializedName("pending_invitations_count")
        @Expose
        private Integer pendingInvitationsCount;

        public List<Profile> getProfiles() {
            return profiles;
        }

        public void setProfiles(List<Profile> profiles) {
            this.profiles = profiles;
        }

        public Integer getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
        }

        public Integer getPendingInvitationsCount() {
            return pendingInvitationsCount;
        }

        public void setPendingInvitationsCount(Integer pendingInvitationsCount) {
            this.pendingInvitationsCount = pendingInvitationsCount;
        }

        public class Profile {

            @SerializedName("general_information")
            @Expose
            private GeneralInformation generalInformation;
            @SerializedName("approved_time")
            @Expose
            private Double approvedTime;
            @SerializedName("photos")
            @Expose
            private List<Photo> photos = null;
            @SerializedName("user_interests")
            @Expose
            private List<Object> userInterests = null;
            @SerializedName("work")
            @Expose
            private Work work;
            @SerializedName("preferences")
            @Expose
            private List<Preference> preferences = null;
            @SerializedName("instagram_images")
            @Expose
            private Object instagramImages;
            @SerializedName("last_seen_window")
            @Expose
            private String lastSeenWindow;
            @SerializedName("is_facebook_data_fetched")
            @Expose
            private Boolean isFacebookDataFetched;
            @SerializedName("icebreakers")
            @Expose
            private Object icebreakers;
            @SerializedName("story")
            @Expose
            private Object story;
            @SerializedName("meetup")
            @Expose
            private Object meetup;
            @SerializedName("verification_status")
            @Expose
            private String verificationStatus;
            @SerializedName("latest_poll")
            @Expose
            private Object latestPoll;
            @SerializedName("poll_info")
            @Expose
            private Object pollInfo;
            @SerializedName("has_active_subscription")
            @Expose
            private Boolean hasActiveSubscription;
            @SerializedName("show_concierge_badge")
            @Expose
            private Boolean showConciergeBadge;
            @SerializedName("lat")
            @Expose
            private String lat;
            @SerializedName("lng")
            @Expose
            private String lng;
            @SerializedName("last_seen")
            @Expose
            private String lastSeen;
            @SerializedName("online_code")
            @Expose
            private Integer onlineCode;
            @SerializedName("profile_data_list")
            @Expose
            private List<ProfileData> profileDataList = null;

            public GeneralInformation getGeneralInformation() {
                return generalInformation;
            }

            public void setGeneralInformation(GeneralInformation generalInformation) {
                this.generalInformation = generalInformation;
            }

            public Double getApprovedTime() {
                return approvedTime;
            }

            public void setApprovedTime(Double approvedTime) {
                this.approvedTime = approvedTime;
            }

            public List<Photo> getPhotos() {
                return photos;
            }

            public void setPhotos(List<Photo> photos) {
                this.photos = photos;
            }

            public List<Object> getUserInterests() {
                return userInterests;
            }

            public void setUserInterests(List<Object> userInterests) {
                this.userInterests = userInterests;
            }

            public Work getWork() {
                return work;
            }

            public void setWork(Work work) {
                this.work = work;
            }

            public List<Preference> getPreferences() {
                return preferences;
            }

            public void setPreferences(List<Preference> preferences) {
                this.preferences = preferences;
            }

            public Object getInstagramImages() {
                return instagramImages;
            }

            public void setInstagramImages(Object instagramImages) {
                this.instagramImages = instagramImages;
            }

            public String getLastSeenWindow() {
                return lastSeenWindow;
            }

            public void setLastSeenWindow(String lastSeenWindow) {
                this.lastSeenWindow = lastSeenWindow;
            }

            public Boolean getIsFacebookDataFetched() {
                return isFacebookDataFetched;
            }

            public void setIsFacebookDataFetched(Boolean isFacebookDataFetched) {
                this.isFacebookDataFetched = isFacebookDataFetched;
            }

            public Object getIcebreakers() {
                return icebreakers;
            }

            public void setIcebreakers(Object icebreakers) {
                this.icebreakers = icebreakers;
            }

            public Object getStory() {
                return story;
            }

            public void setStory(Object story) {
                this.story = story;
            }

            public Object getMeetup() {
                return meetup;
            }

            public void setMeetup(Object meetup) {
                this.meetup = meetup;
            }

            public String getVerificationStatus() {
                return verificationStatus;
            }

            public void setVerificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
            }

            public Object getLatestPoll() {
                return latestPoll;
            }

            public void setLatestPoll(Object latestPoll) {
                this.latestPoll = latestPoll;
            }

            public Object getPollInfo() {
                return pollInfo;
            }

            public void setPollInfo(Object pollInfo) {
                this.pollInfo = pollInfo;
            }

            public Boolean getHasActiveSubscription() {
                return hasActiveSubscription;
            }

            public void setHasActiveSubscription(Boolean hasActiveSubscription) {
                this.hasActiveSubscription = hasActiveSubscription;
            }

            public Boolean getShowConciergeBadge() {
                return showConciergeBadge;
            }

            public void setShowConciergeBadge(Boolean showConciergeBadge) {
                this.showConciergeBadge = showConciergeBadge;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }

            public String getLastSeen() {
                return lastSeen;
            }

            public void setLastSeen(String lastSeen) {
                this.lastSeen = lastSeen;
            }

            public Integer getOnlineCode() {
                return onlineCode;
            }

            public void setOnlineCode(Integer onlineCode) {
                this.onlineCode = onlineCode;
            }

            public List<ProfileData> getProfileDataList() {
                return profileDataList;
            }

            public void setProfileDataList(List<ProfileData> profileDataList) {
                this.profileDataList = profileDataList;
            }

            public class ProfileData {

                @SerializedName("question")
                @Expose
                private String question;
                @SerializedName("preferences")
                @Expose
                private List<Preference__1> preferences = null;
                @SerializedName("invitation_type")
                @Expose
                private String invitationType;

                public String getQuestion() {
                    return question;
                }

                public void setQuestion(String question) {
                    this.question = question;
                }

                public List<Preference__1> getPreferences() {
                    return preferences;
                }

                public void setPreferences(List<Preference__1> preferences) {
                    this.preferences = preferences;
                }

                public String getInvitationType() {
                    return invitationType;
                }

                public void setInvitationType(String invitationType) {
                    this.invitationType = invitationType;
                }

                public class Preference__1 {

                    @SerializedName("answer_id")
                    @Expose
                    private Integer answerId;
                    @SerializedName("answer")
                    @Expose
                    private String answer;
                    @SerializedName("first_choice")
                    @Expose
                    private String firstChoice;
                    @SerializedName("second_choice")
                    @Expose
                    private String secondChoice;

                    public Integer getAnswerId() {
                        return answerId;
                    }

                    public void setAnswerId(Integer answerId) {
                        this.answerId = answerId;
                    }

                    public String getAnswer() {
                        return answer;
                    }

                    public void setAnswer(String answer) {
                        this.answer = answer;
                    }

                    public String getFirstChoice() {
                        return firstChoice;
                    }

                    public void setFirstChoice(String firstChoice) {
                        this.firstChoice = firstChoice;
                    }

                    public String getSecondChoice() {
                        return secondChoice;
                    }

                    public void setSecondChoice(String secondChoice) {
                        this.secondChoice = secondChoice;
                    }

                }

            }

            public class Preference {

                @SerializedName("answer_id")
                @Expose
                private Integer answerId;
                @SerializedName("id")
                @Expose
                private Integer id;
                @SerializedName("value")
                @Expose
                private Integer value;
                @SerializedName("preference_question")
                @Expose
                private PreferenceQuestion preferenceQuestion;

                public Integer getAnswerId() {
                    return answerId;
                }

                public void setAnswerId(Integer answerId) {
                    this.answerId = answerId;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public Integer getValue() {
                    return value;
                }

                public void setValue(Integer value) {
                    this.value = value;
                }

                public PreferenceQuestion getPreferenceQuestion() {
                    return preferenceQuestion;
                }

                public void setPreferenceQuestion(PreferenceQuestion preferenceQuestion) {
                    this.preferenceQuestion = preferenceQuestion;
                }

                public class PreferenceQuestion {

                    @SerializedName("first_choice")
                    @Expose
                    private String firstChoice;
                    @SerializedName("second_choice")
                    @Expose
                    private String secondChoice;

                    public String getFirstChoice() {
                        return firstChoice;
                    }

                    public void setFirstChoice(String firstChoice) {
                        this.firstChoice = firstChoice;
                    }

                    public String getSecondChoice() {
                        return secondChoice;
                    }

                    public void setSecondChoice(String secondChoice) {
                        this.secondChoice = secondChoice;
                    }

                }

            }

            public class Photo {

                @SerializedName("photo")
                @Expose
                private String photo;
                @SerializedName("photo_id")
                @Expose
                private Integer photoId;
                @SerializedName("selected")
                @Expose
                private Boolean selected;
                @SerializedName("status")
                @Expose
                private Object status;

                public String getPhoto() {
                    return photo;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public Integer getPhotoId() {
                    return photoId;
                }

                public void setPhotoId(Integer photoId) {
                    this.photoId = photoId;
                }

                public Boolean getSelected() {
                    return selected;
                }

                public void setSelected(Boolean selected) {
                    this.selected = selected;
                }

                public Object getStatus() {
                    return status;
                }

                public void setStatus(Object status) {
                    this.status = status;
                }

            }

            public class Work {

                @SerializedName("industry")
                @Expose
                private String industry;
                @SerializedName("industry_v1")
                @Expose
                private IndustryV1 industryV1;
                @SerializedName("monthly_income_v1")
                @Expose
                private Object monthlyIncomeV1;
                @SerializedName("experience")
                @Expose
                private String experience;
                @SerializedName("experience_v1")
                @Expose
                private ExperienceV1 experienceV1;
                @SerializedName("highest_qualification")
                @Expose
                private String highestQualification;
                @SerializedName("highest_qualification_v1")
                @Expose
                private HighestQualificationV1 highestQualificationV1;
                @SerializedName("field_of_study")
                @Expose
                private String fieldOfStudy;
                @SerializedName("field_of_study_v1")
                @Expose
                private FieldOfStudyV1 fieldOfStudyV1;

                public String getIndustry() {
                    return industry;
                }

                public void setIndustry(String industry) {
                    this.industry = industry;
                }

                public IndustryV1 getIndustryV1() {
                    return industryV1;
                }

                public void setIndustryV1(IndustryV1 industryV1) {
                    this.industryV1 = industryV1;
                }

                public Object getMonthlyIncomeV1() {
                    return monthlyIncomeV1;
                }

                public void setMonthlyIncomeV1(Object monthlyIncomeV1) {
                    this.monthlyIncomeV1 = monthlyIncomeV1;
                }

                public String getExperience() {
                    return experience;
                }

                public void setExperience(String experience) {
                    this.experience = experience;
                }

                public ExperienceV1 getExperienceV1() {
                    return experienceV1;
                }

                public void setExperienceV1(ExperienceV1 experienceV1) {
                    this.experienceV1 = experienceV1;
                }

                public String getHighestQualification() {
                    return highestQualification;
                }

                public void setHighestQualification(String highestQualification) {
                    this.highestQualification = highestQualification;
                }

                public HighestQualificationV1 getHighestQualificationV1() {
                    return highestQualificationV1;
                }

                public void setHighestQualificationV1(HighestQualificationV1 highestQualificationV1) {
                    this.highestQualificationV1 = highestQualificationV1;
                }

                public String getFieldOfStudy() {
                    return fieldOfStudy;
                }

                public void setFieldOfStudy(String fieldOfStudy) {
                    this.fieldOfStudy = fieldOfStudy;
                }

                public FieldOfStudyV1 getFieldOfStudyV1() {
                    return fieldOfStudyV1;
                }

                public void setFieldOfStudyV1(FieldOfStudyV1 fieldOfStudyV1) {
                    this.fieldOfStudyV1 = fieldOfStudyV1;
                }

                public class ExperienceV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("name_alias")
                    @Expose
                    private String nameAlias;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getNameAlias() {
                        return nameAlias;
                    }

                    public void setNameAlias(String nameAlias) {
                        this.nameAlias = nameAlias;
                    }

                }

                public class IndustryV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("preference_only")
                    @Expose
                    private Boolean preferenceOnly;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Boolean getPreferenceOnly() {
                        return preferenceOnly;
                    }

                    public void setPreferenceOnly(Boolean preferenceOnly) {
                        this.preferenceOnly = preferenceOnly;
                    }

                }

                public class HighestQualificationV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("preference_only")
                    @Expose
                    private Boolean preferenceOnly;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Boolean getPreferenceOnly() {
                        return preferenceOnly;
                    }

                    public void setPreferenceOnly(Boolean preferenceOnly) {
                        this.preferenceOnly = preferenceOnly;
                    }

                }

                public class FieldOfStudyV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                }
            }

            public class GeneralInformation {

                @SerializedName("date_of_birth")
                @Expose
                private String dateOfBirth;
                @SerializedName("date_of_birth_v1")
                @Expose
                private String dateOfBirthV1;
                @SerializedName("location")
                @Expose
                private Location location;
                @SerializedName("drinking")
                @Expose
                private String drinking;
                @SerializedName("drinking_v1")
                @Expose
                private DrinkingV1 drinkingV1;
                @SerializedName("first_name")
                @Expose
                private String firstName;
                @SerializedName("gender")
                @Expose
                private String gender;
                @SerializedName("marital_status")
                @Expose
                private String maritalStatus;
                @SerializedName("marital_status_v1")
                @Expose
                private MaritalStatusV1 maritalStatusV1;
                @SerializedName("ref_id")
                @Expose
                private String refId;
                @SerializedName("smoking")
                @Expose
                private String smoking;
                @SerializedName("smoking_v1")
                @Expose
                private SmokingV1 smokingV1;
                @SerializedName("sun_sign")
                @Expose
                private String sunSign;
                @SerializedName("sun_sign_v1")
                @Expose
                private SunSignV1 sunSignV1;
                @SerializedName("mother_tongue")
                @Expose
                private MotherTongue motherTongue;
                @SerializedName("faith")
                @Expose
                private Faith faith;
                @SerializedName("height")
                @Expose
                private Integer height;
                @SerializedName("cast")
                @Expose
                private Object cast;
                @SerializedName("kid")
                @Expose
                private Object kid;
                @SerializedName("diet")
                @Expose
                private Object diet;
                @SerializedName("politics")
                @Expose
                private Object politics;
                @SerializedName("pet")
                @Expose
                private Object pet;
                @SerializedName("settle")
                @Expose
                private Object settle;
                @SerializedName("age")
                @Expose
                private Integer age;

                public String getDateOfBirth() {
                    return dateOfBirth;
                }

                public void setDateOfBirth(String dateOfBirth) {
                    this.dateOfBirth = dateOfBirth;
                }

                public String getDateOfBirthV1() {
                    return dateOfBirthV1;
                }

                public void setDateOfBirthV1(String dateOfBirthV1) {
                    this.dateOfBirthV1 = dateOfBirthV1;
                }

                public Location getLocation() {
                    return location;
                }

                public void setLocation(Location location) {
                    this.location = location;
                }

                public String getDrinking() {
                    return drinking;
                }

                public void setDrinking(String drinking) {
                    this.drinking = drinking;
                }

                public DrinkingV1 getDrinkingV1() {
                    return drinkingV1;
                }

                public void setDrinkingV1(DrinkingV1 drinkingV1) {
                    this.drinkingV1 = drinkingV1;
                }

                public String getFirstName() {
                    return firstName;
                }

                public void setFirstName(String firstName) {
                    this.firstName = firstName;
                }

                public String getGender() {
                    return gender;
                }

                public void setGender(String gender) {
                    this.gender = gender;
                }

                public String getMaritalStatus() {
                    return maritalStatus;
                }

                public void setMaritalStatus(String maritalStatus) {
                    this.maritalStatus = maritalStatus;
                }

                public MaritalStatusV1 getMaritalStatusV1() {
                    return maritalStatusV1;
                }

                public void setMaritalStatusV1(MaritalStatusV1 maritalStatusV1) {
                    this.maritalStatusV1 = maritalStatusV1;
                }

                public String getRefId() {
                    return refId;
                }

                public void setRefId(String refId) {
                    this.refId = refId;
                }

                public String getSmoking() {
                    return smoking;
                }

                public void setSmoking(String smoking) {
                    this.smoking = smoking;
                }

                public SmokingV1 getSmokingV1() {
                    return smokingV1;
                }

                public void setSmokingV1(SmokingV1 smokingV1) {
                    this.smokingV1 = smokingV1;
                }

                public String getSunSign() {
                    return sunSign;
                }

                public void setSunSign(String sunSign) {
                    this.sunSign = sunSign;
                }

                public SunSignV1 getSunSignV1() {
                    return sunSignV1;
                }

                public void setSunSignV1(SunSignV1 sunSignV1) {
                    this.sunSignV1 = sunSignV1;
                }

                public MotherTongue getMotherTongue() {
                    return motherTongue;
                }

                public void setMotherTongue(MotherTongue motherTongue) {
                    this.motherTongue = motherTongue;
                }

                public Faith getFaith() {
                    return faith;
                }

                public void setFaith(Faith faith) {
                    this.faith = faith;
                }

                public Integer getHeight() {
                    return height;
                }

                public void setHeight(Integer height) {
                    this.height = height;
                }

                public Object getCast() {
                    return cast;
                }

                public void setCast(Object cast) {
                    this.cast = cast;
                }

                public Object getKid() {
                    return kid;
                }

                public void setKid(Object kid) {
                    this.kid = kid;
                }

                public Object getDiet() {
                    return diet;
                }

                public void setDiet(Object diet) {
                    this.diet = diet;
                }

                public Object getPolitics() {
                    return politics;
                }

                public void setPolitics(Object politics) {
                    this.politics = politics;
                }

                public Object getPet() {
                    return pet;
                }

                public void setPet(Object pet) {
                    this.pet = pet;
                }

                public Object getSettle() {
                    return settle;
                }

                public void setSettle(Object settle) {
                    this.settle = settle;
                }

                public Integer getAge() {
                    return age;
                }

                public void setAge(Integer age) {
                    this.age = age;
                }

                public class MotherTongue {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                }

                public class DrinkingV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("name_alias")
                    @Expose
                    private String nameAlias;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getNameAlias() {
                        return nameAlias;
                    }

                    public void setNameAlias(String nameAlias) {
                        this.nameAlias = nameAlias;
                    }

                }

                public class Faith {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                }

                public class Location {

                    @SerializedName("summary")
                    @Expose
                    private String summary;
                    @SerializedName("full")
                    @Expose
                    private String full;

                    public String getSummary() {
                        return summary;
                    }

                    public void setSummary(String summary) {
                        this.summary = summary;
                    }

                    public String getFull() {
                        return full;
                    }

                    public void setFull(String full) {
                        this.full = full;
                    }

                }

                public class MaritalStatusV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("preference_only")
                    @Expose
                    private Boolean preferenceOnly;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Boolean getPreferenceOnly() {
                        return preferenceOnly;
                    }

                    public void setPreferenceOnly(Boolean preferenceOnly) {
                        this.preferenceOnly = preferenceOnly;
                    }

                }

                public class SmokingV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("name_alias")
                    @Expose
                    private String nameAlias;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getNameAlias() {
                        return nameAlias;
                    }

                    public void setNameAlias(String nameAlias) {
                        this.nameAlias = nameAlias;
                    }

                }

                public class SunSignV1 {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                }
            }
        }
    }

}
