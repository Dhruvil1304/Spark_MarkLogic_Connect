package com.marklogic.spark


case class ClinicalStudy(
                          required_header: RequiredHeader,
                          id_info: IdInfo,
                          brief_title: String,
                          official_title: String,
                          sponsors: Sponsors,
                          source: String,
                          oversight_info: OversightInfo,
                          brief_summary: BriefSummary,
                          overall_status: String,
                          start_date: String,
                          completion_date: CompletionDate,
                          primary_completion_date: CompletionDate,
                          study_type: String,
                          has_expanded_access: String,
                          study_design_info: StudyDesignInfo,
                          enrollment: Enrollment,
                          conditions: List[String],
                          biospec_retention: String,
                          biospec_descr: BiospecDescr,
                          eligibility: Eligibility,
                          overall_official: OverallOfficial,
                          overall_contact: OverallContact,
                          location: Location,
                          location_countries: LocationCountries,
                          link: Link,
                          verification_date: String,
                          study_first_submitted: String,
                          study_first_submitted_qc: String,
                          study_first_posted: StudyPosted,
                          last_update_submitted: String,
                          last_update_submitted_qc: String,
                          last_update_posted: StudyPosted,
                          responsible_party: ResponsibleParty,
                          keyword: List[String],
                          condition_browse: ConditionBrowse
                        )

case class RequiredHeader(
                           download_date: String,
                           link_text: String,
                           url: String
                         )

case class IdInfo(
                   org_study_id: String,
                   secondary_id: String,
                   nct_id: String
                 )

case class Sponsors(
                     lead_sponsor: LeadSponsor
                   )

case class LeadSponsor(
                        agency: String,
                        agency_class: String
                      )

case class OversightInfo(
                          has_dmc: String
                        )

case class BriefSummary(
                         textblock: String
                       )

case class CompletionDate(
                           `type`: String,
                           value: String
                         )

case class StudyDesignInfo(
                            observational_model: String,
                            time_perspective: String
                          )

case class Enrollment(
                       `type`: String,
                       value: String
                     )

case class BiospecDescr(
                         textblock: String
                       )

case class Eligibility(
                        study_pop: StudyPop,
                        sampling_method: String,
                        criteria: Criteria,
                        gender: String,
                        minimum_age: String,
                        maximum_age: String,
                        healthy_volunteers: String
                      )

case class StudyPop(
                     textblock: String
                   )

case class Criteria(
                     textblock: String
                   )

case class OverallOfficial(
                            last_name: String,
                            role: String,
                            affiliation: String
                          )

case class OverallContact(
                           last_name: String,
                           phone: String,
                           email: String
                         )

case class Location(
                     facility: Facility,
                     status: String,
                     contact: Contact,
                     investigator: Investigator
                   )

case class Facility(
                     name: String,
                     address: Address
                   )

case class Address(
                    city: String,
                    state: String,
                    zip: String,
                    country: String
                  )

case class Contact(
                    last_name: String,
                    phone: String,
                    phone_ext: String,
                    email: String
                  )

case class Investigator(
                         last_name: String,
                         role: String
                       )

case class LocationCountries(
                              country: String
                            )

case class Link(
                 url: String,
                 description: String
               )

case class StudyPosted(
                        `type`: String,
                        value: String
                      )

case class ResponsibleParty(
                             responsible_party_type: String
                           )

case class ConditionBrowse(
                            mesh_term: String
                          )

