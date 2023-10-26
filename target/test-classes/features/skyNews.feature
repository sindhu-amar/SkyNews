Feature: Sky News website tests

  Scenario: Verify the browser tab’s title.
    When I navigate to Sky News Website home page
    Then I should see the descriptive title "Latest News from the UK and Around the World | Sky News" displayed in browser tab

  Scenario Outline: Verify the number of categories displayed and their names.
    Given I navigate to Sky News Website home page
    When I click the "<Menu>" tab
    Then I should see the appropriate title "<Title>" displayed

    Examples:
    | Menu             | Title                     |
    | UK               | UK News                   |
    | World            | World News                |
    | Israel-Hamas War | Israel-Hamas War          |
    | Politics         | Political News            |
    | US               | US News                   |
    | Climate          | Climate                   |
    | Science & Tech   | Tech News                 |
    | Business         | Business News             |
    | Ents & Arts      | Entertainment News        |
    | Travel           | The Latest News           |
    | Offbeat          | Weird News                |
    | Analysis         | Latest News Analysis      |
    | Data & Forensics | Latest Data and Forensics |
    | Videos           | Latest Video News         |
    | Weather          | Weather Forecast          |

    Scenario: Verify the default focus point is on the Home category.
      When I navigate to Sky News Website home page
      Then Sky News website must default to the Home category

    Scenario: Verify that if the user clicks on ‘Climate’, this becomes the focus.
      Given I navigate to Sky News Website home page
      When I click the "Climate" tab
      Then I should see the Climate title "Climate" displayed
      And Climate tab becomes the focus

    Scenario: Verify that a word of your choice in the title of the article you have just selected appears once the title of the page loads.
      Given I navigate to Sky News Website home page
      When I select one story from the home page
      Then The title of the resulting page contains the words from the title of the story selected



