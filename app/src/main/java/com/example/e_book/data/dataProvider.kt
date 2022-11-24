package com.example.e_book.data

import com.example.e_book.R

data class dataProvider(val bookName:String, val array: List<dataProviderToCard>) {
    val Book:String
    get() = bookName
    val booList:List<dataProviderToCard>
    get() = array
}
data class dataProviderToCard(val name:String, val bookImage: Int, val bookName: String){
    val image:Int
    get() = bookImage
    val Book:String
    get() = name
    val Book1:String
    get() = bookName
}

val Fiction= listOf(
    dataProviderToCard(name ="Boundaries_When_to_Say_Yes.pdf" , bookImage =R.drawable.when_to_say_yes_image , bookName = "Boundaries"),
    dataProviderToCard(name ="Calm.pdf" , bookImage =R.drawable.calm, bookName = "Calm" ),
    dataProviderToCard(name ="Half_Girlfriend_by_Chetan_Bhagat.pdf" , bookImage =R.drawable.halg_girlfriend , bookName = "Half"),
    dataProviderToCard(name ="How_I_made_my_first_million _26.pdf" , bookImage =R.drawable.how_i_made_my_first_million , bookName = "How I Made Million"),
    dataProviderToCard(name ="Living_in_the_Light.pdf" , bookImage =R.drawable.living_in_the_light, bookName = "Living in the Light" ),
    dataProviderToCard(name ="Rich_Dad_Poor_Dad.pdf" , bookImage =R.drawable.rich_dad_poor_dad , bookName = "Rich Dad and Poor Dar"),
    dataProviderToCard(name ="The Intelligent Investor.pdf" , bookImage =R.drawable.the_intelligent_investor, bookName = "Intelligent Investor" ),
    dataProviderToCard(name ="The_4_Hour_Workweek.pdf" , bookImage =R.drawable.the_hour_workweek , "4 hour Workweek"),
    dataProviderToCard(name ="The_5_Second_Rule_Transform_your_Life.pdf" , bookImage =R.drawable.the_second_rule_transformyourlife_image, "5 Second Transformation" ),
    dataProviderToCard(name ="The_Miracle_Morning.pdf" , bookImage =R.drawable.the_miracle_morning, bookName = "Miracle Morning" ),
    dataProviderToCard(name ="Warren_Buffett.pdf" , bookImage =R.drawable.warren_buffett_the_ultimate_guide_to_investing_like, bookName = "Warren Buffett"),
    dataProviderToCard(name ="You_Are_Badass.pdf" , bookImage =R.drawable.you_are_a_badass , bookName = "You are Badass"),
)
val Popular= listOf(
    dataProviderToCard(name ="From_Failure_to_Success_ Everyday_Habits_and_Exercises.pdf" , bookImage =R.drawable.failure, bookName = "From Failure to Success" ),
    dataProviderToCard(name ="Horror_Stories.pdf" , bookImage =R.drawable.horror_stories_img , bookName = "Horror Stories"),
    dataProviderToCard(name ="How_to_stop_worrying_and_start_living.pdf" , bookImage =R.drawable.how_to_stop_worrying_and_start_living_img, bookName = "How to Stop Worrying "),
    dataProviderToCard(name ="How_To_Win_Friends_and_Influence_People.pdf" , bookImage =R.drawable.how_to_win_friends_and_influence_people_img, bookName = "How to Win Friends " ),
    dataProviderToCard(name ="Never_Split_the_Difference_Negotiating.pdf" , bookImage = R.drawable.never_split_the_difference_negotiating_img, bookName = "Never Split Negotiating"),
    dataProviderToCard(name ="spoken_english_laerning_quikly.pdf" , bookImage = R.drawable.spoken_english_laerning_quikly_img, "Spoken English"),
    dataProviderToCard(name ="The_Rules_of_Work.pdf" , bookImage = R.drawable.the_rules_of_work_img, "Rule of Work"),
    dataProviderToCard(name ="Think_And_Grow_Rich.pdf" , bookImage =R.drawable.think_and_grow_rich_img , "Think and Grow Rich"),
    dataProviderToCard(name ="Time_Management.pdf" , bookImage =R.drawable.time_management_img , "Time Management"),
    dataProviderToCard(name ="Why_A_Students_Work.pdf" , bookImage =R.drawable.why_a_students_work_img, "Why a Students Work" ),
)
val biography= listOf(
    dataProviderToCard(name ="Greenwood.pdf" , bookImage =R.drawable.greenwood_image , "Greenwood"),
    dataProviderToCard(name ="Greenwood_Biographies.pdf" , bookImage =R.drawable.greenwood_biographies_image , "Greenwood Biography"),
    dataProviderToCard(name ="Karl _Marx_ A.pdf" , bookImage =R.drawable.karl_marx_a_image , "Karl Marx"),
    dataProviderToCard(name ="Martin_Luther_King.pdf" , bookImage =R.drawable.martin_luther_king_image,"Martin Luther King" ),
    dataProviderToCard(name ="Michael Jordan_ A.pdf" , bookImage =R.drawable.michael_jordan_a_iamge,"Michael Jorden" ),
    dataProviderToCard(name ="Mother.pdf" , bookImage =R.drawable.mother_image ,"Mother"),
    dataProviderToCard(name ="Napoleon.pdf" , bookImage = R.drawable.napoleon_image, "Napoleon"),
    dataProviderToCard(name = "The_5_Second_Rule_TransformyourLife.pdf", bookImage =R.drawable.the_second_rule_transformyourlife_image ,"5 Second Transformation"),
    dataProviderToCard(name ="When_to_Say_Yes.pdf" , bookImage =R.drawable.when_to_say_yes_image ,"When to Say Yes"),
    dataProviderToCard(name ="You_Are_a_Badass.pdf" , bookImage =R.drawable.you_are_a_badass ,"You are a Badass"),
)
val career=listOf(
    dataProviderToCard(name ="Business_Math_For_Dummies.pdf" , bookImage =R.drawable.business_math_for_dummies_image ,"Business for Dummies"),
    dataProviderToCard(name ="Businesses_You_Can_Start_from_Home.pdf" , bookImage =R.drawable.businesses_you_can_start_from_home_image ,"Businesses form Home"),
    dataProviderToCard(name ="Do_the_Work.pdf" , bookImage =R.drawable.do_the_work_image,"Do the Work" ),
    dataProviderToCard(name ="Effective_Business.pdf" , bookImage =R.drawable.effective_business_image ,"Effective Business"),
    dataProviderToCard(name ="How _to_Win_Every_Argument.pdf" , bookImage = R.drawable.how_to_win_every_argument_iamge,"How to Win Argument"),
    dataProviderToCard(name ="Real_Business_Plans.pdf" , bookImage = R.drawable.real_business_plans_image,"Real Business Plan"),
    dataProviderToCard(name ="Start_and_Run.pdf" , bookImage =R.drawable.start_and_run_image ,"Start and Run"),
    dataProviderToCard(name ="Start_Your_Own_Business.pdf" , bookImage =R.drawable.start_your_own_business_iamge ,"Start Your own Business"),
    dataProviderToCard(name ="Starting_and_Running_a_Coaching.pdf" , bookImage =R.drawable.starting_and_running_a_coaching_image ,"Starting Coaching"),
    dataProviderToCard(name ="The_Small_Business.pdf" , bookImage =R.drawable.the_small_business_image,"Small Business" ),
    dataProviderToCard(name = "Youtube_for_Business.pdf", bookImage =R.drawable.youtube_for_business_image,"Youtube for Business" ),
)
val environment= listOf(
    dataProviderToCard(name = "change.pdf", bookImage =R.drawable.climate_change_and_migration,"Change" ),
    dataProviderToCard(name = "Cities_and_Climate_Change.pdf", bookImage = R.drawable.cities_and_climate_change_image,"Climate Change"),
    dataProviderToCard(name ="Earth_Science.pdf" , bookImage =R.drawable.earth_science_pdf,"Earth Science" ),
    dataProviderToCard(name ="Environmental_Biotechnology.pdf" , bookImage =R.drawable.environmental_biotechnology_iamge ,"Environment Biotechnology"),
    dataProviderToCard(name = "Farm_Animal.pdf", bookImage =R.drawable.farm_animal_image ,"Animal Farm"),
    dataProviderToCard(name ="Greening.pdf" , bookImage =R.drawable.greening_image,"Greening" ),
    dataProviderToCard(name ="solid_waste_management_and_recycling.pdf" , bookImage =R.drawable.solid_waste_management_and_recycling_image ,"Waste Management"),
    dataProviderToCard(name = "Sustainable_Urban_Mobility.pdf", bookImage =R.drawable.sustainable_urban_mobility_image,"Sustainable Urban Mobility" ),
    dataProviderToCard(name ="Sweetgrass_ Indigenous_Wisdom.pdf" , bookImage =R.drawable.sweetgrass_indigenous_wisdom_image ,"Indigenous Wisdom"),
    dataProviderToCard(name ="The_Politics_of_the_Environment.pdf" , bookImage =R.drawable.the_politics_of_the_environment_imae ,"Politics of the Environment"),
    dataProviderToCard(name ="The_Tiger_ A_True_Story_of_Vengeance_and_Survival.pdf" , bookImage =R.drawable.the_tiger_a_true_story_of_vengeance_and_survival_image ,"Tiger Story "),
)
val health= listOf(
    dataProviderToCard(name ="Anxiety_Depression_Workbook.pdf" , bookImage = R.drawable.anxietydepressionworkbookimage,"Anxiety Depression"),
    dataProviderToCard(name ="Emergency_Medicine.pdf" , bookImage = R.drawable.emergency_medicine_image,"Emergency Medicine"),
    dataProviderToCard(name ="Genius_Foods_Become.pdf" , bookImage =R.drawable.genius_foods_become_image,"Genius Foods Became" ),
    dataProviderToCard(name ="healthyweightloss.pdf" , bookImage = R.drawable.healthyweightloss_image,"Healthy Weight Loss"),
    dataProviderToCard(name ="Light_on_Life_The_YogaJourney.pdf" , bookImage =R.drawable.light_on_life_the_yogajourney_image,"Yoga Journey" ),
    dataProviderToCard(name ="Light_on_Yoga.pdf" , bookImage =R.drawable.light_on_yoga_image,"Light on Yoga" ),
    dataProviderToCard(name ="Marcus_Aurelius_Meditations.pdf" , bookImage =R.drawable.marcus_aurelius_meditations_image,"Aurelius Meditations" ),
    dataProviderToCard(name ="Meditations_on_Wisdom.pdf" , bookImage =R.drawable.meditations_on_wisdom_imge,"Meditations on Wisdom" ),
    dataProviderToCard(name ="Miracle_A_Year_of_Food_Life.pdf" , bookImage = R.drawable.miracle_a_year_of_food_life_image,"Year of Food Life"),
    dataProviderToCard(name ="On_Food_and_Cooking.pdf" , bookImage = R.drawable.on_food_and_cooking_image,"On Food and Cooking"),
    dataProviderToCard(name ="The_War_of_Art_Break.pdf" , bookImage =R.drawable.the_war_of_art_break_image,"War of Art Break" ),
)
val lifeStyle= listOf(
    dataProviderToCard(name ="Dictionary_Flowers_And_Plants_For_Gardening.pdf"  , bookImage =R.drawable.dictionary_flowers_and_plants_for_gardening_imgae ,"Flowers and Plants"),
    dataProviderToCard(name = "Dubai_amp.pdf" , bookImage =R.drawable.dubai_amp_image ,"Dubai Amp"),
    dataProviderToCard(name ="FW_OUTDOOR.pdf"  , bookImage =R.drawable.outdoor_image ,"Outdoor"),
    dataProviderToCard(name ="Handbook_of_Medicinal_Herbs.pdf"  , bookImage =R.drawable.handbook_of_medicinal_herbs_image,"Medicinal Herbs" ),
    dataProviderToCard(name ="India_Rajasthan.pdf"  , bookImage = R.drawable.india_rajasthan_image,"India Rajasthan"),
    dataProviderToCard(name ="Lonely_Planet_Guide.pdf"  , bookImage = R.drawable.lonely_planet_guide_imge,"Lonely Plant "),
    dataProviderToCard(name ="lonely_planet_volunteer_abroad_guide.pdf"  , bookImage =R.drawable.lonely_planet_volunteer_abroad_guide_img ,"Volunteer abroad guide"),
    dataProviderToCard(name ="Organic_Gardening_for_Dummies.pdf"  , bookImage =R.drawable.organic_gardening_for_dummies_img ,"Organic Gardening"),
    dataProviderToCard(name ="PLANT_BIOTECHPrinciples_Techniques_and_Applications.pdf"  , bookImage =R.drawable.plant_biotechprinciples_techniques_and_applications_img ,"Plant Biotech"),
    dataProviderToCard(name ="TOFG.pdf"  , bookImage = R.drawable.tofg_img, "TOFG"),
)
val religion= listOf(
    dataProviderToCard(name ="Bhagavad_Gita.pdf" , bookImage =R.drawable.bhagavad_gita_img,"Bhagava Gita" ),
    dataProviderToCard(name ="Chanakya_Neeti.pdf", bookImage =R.drawable.chanakya_neeti_img ,"Chanakya Neeti"),
    dataProviderToCard(name ="Encyclopedia_of_Psychology_and_Religion.pdf" , bookImage =R.drawable.encyclopedia_of_psychology_and_religion_img,"Psychology and Religion" ),
    dataProviderToCard(name ="Exceedingly_Growing_Faith", bookImage =R.drawable.exceedingly_growing_fait_img,"Growing Faith" ),
    dataProviderToCard(name ="Give_and_Take.pdf", bookImage =R.drawable.give_and_take_img ,"Give and Take"),
    dataProviderToCard(name ="The Illustrated Encyclopedia of Hinduism (2 Vol Set) ( PDFDrive ).pdf" , bookImage =R.drawable.the_illustrated_encyclopedia_of_hinduism_img,"hinduism" ),
    dataProviderToCard(name ="The_Arthashastra.pdf" , bookImage =R.drawable.the_arthashastra_img,"Arthashastra" ),
    dataProviderToCard(name ="The_Book_of_Secret_Wisdom.pdf" , bookImage = R.drawable.the_book_of_secret_wisdom_img,"Secret Wishdom"),
)
val science= listOf(
    dataProviderToCard(name ="Biology_Questions_and_Answers.pdf" , bookImage =R.drawable.biology_questions_and_answers_img,"Biology Q&A" ),
    dataProviderToCard(name ="Biomechanical_Evaluation.pdf" , bookImage = R.drawable.biomechanical_evaluation_img,"biomechanical"),
    dataProviderToCard(name ="Janice_VanCleave.pdf" , bookImage =R.drawable.janice_canvleave_img ,"janice VanCleave"),
    dataProviderToCard(name ="Living_in_the_Light.pdf" , bookImage = R.drawable.living_in_the_light,"Living in the light"),
    dataProviderToCard(name ="Physical_Science_with_Earth_Science.pdf" , bookImage =R.drawable.physical_science_with_earth_science_img ,"Earth Science"),
    dataProviderToCard(name ="political_science.pdf" , bookImage =R.drawable.political_science_img ,"Political Science"),
    dataProviderToCard(name ="The_Secret_Science_of_Numerology.pdf" , bookImage =R.drawable.the_secret_science_of_numerology_img ,"Neurology"),
    dataProviderToCard(name ="Things_That_Matter_Three.pdf" , bookImage =R.drawable.things ,"Things That Matter"),
    dataProviderToCard(name ="Waste_Management_for_the_Food_Industries.pdf" , bookImage =R.drawable.waste_management_for_the_food_industries_img ,"Waste Management "),
)
val bookList= listOf(
    dataProvider(
        bookName = "Fiction",
        array = Fiction
    ),
    dataProvider(
        bookName = "Most Popular",
        array = Popular
    ),
    dataProvider(
        bookName = "Biography",
        array = biography
    ),
    dataProvider(
        bookName = "Environment",
        array = environment
    ),
    dataProvider(
        bookName = "Health & Fitness",
        array = health
    ),
    dataProvider(
        bookName = "LifeStyle",
        array = lifeStyle
    ),
    dataProvider(
        bookName = "Science",
        array = science
    ),
    dataProvider(
        bookName = "Religion",
        array = religion
    ),
    dataProvider(
        bookName = "Business & Career",
        array = career
    )

)

var bookImageList= listOf(
    dataProviderToCard(name = "From_Failure_to_Success_ Everyday_Habits_and_Exercises.pdf", bookImage = R.drawable.failure,"Failure to Success"),
    dataProviderToCard(name = "Horror_Stories.pdf",bookImage = R.drawable.horror_stories_img,"Horror Stories"),
    dataProviderToCard(name = "Time_Management.pdf",bookImage = R.drawable.time_management_img,"Time Management"),
    dataProviderToCard(name = "Greenwood.pdf",bookImage = R.drawable.greenwood_image,"Greenwood"),
    dataProviderToCard(name = "Martin_Luther_King.pdf",bookImage = R.drawable.martin_luther_king_image,"Martin Luther King"),
    dataProviderToCard(name = "Hacking_Gmail_2006.pdf",bookImage = R.drawable.hacking_gmail_2006_img,"Gmail Hacking"),

    dataProviderToCard(name = "Mother.pdf",bookImage = R.drawable.mother_image,"Mother Teressa"),
    dataProviderToCard(name = "matlab_prog.pdf",bookImage = R.drawable.matlab_prog_img,"Matlab"),
    dataProviderToCard(name = "Things_That_Matter_Three.pdf",bookImage = R.drawable.things,"Things that Matter Three"),
    dataProviderToCard(name = "You_Are_a_Badass.pdf",bookImage = R.drawable.you_are_a_badass,"You are a Badass"),
    dataProviderToCard(name = "Horror_Stories.pdf",bookImage = R.drawable.horror_stories_img,"Horror Stories"),
    dataProviderToCard(name = "Bhagavad_Gita.pdf",bookImage = R.drawable.bhagavad_gita_img,"Bhagavad Gita"),
    dataProviderToCard(name = "Chanakya_Neeti.pdf",bookImage = R.drawable.chanakya_neeti_img,"Chanakya Neeti"),
    dataProviderToCard(name = "Give_and_Take.pdf",bookImage = R.drawable.give_and_take_img,"Give and Take"),
    dataProviderToCard(name = "The_Arthashastra.pdf",bookImage = R.drawable.the_arthashastra_img,"Arthashatra"),
    dataProviderToCard(name = "Anxiety_Depression_Workbook.pdf",bookImage = R.drawable.anxietydepressionworkbookimage,"Depression"),
    dataProviderToCard(name = "healthyweightloss.pdf",bookImage = R.drawable.healthyweightloss_image,"Healthy Weight Loss"),
    dataProviderToCard(name = "Light_on_Yoga.pdf",bookImage = R.drawable.light_on_yoga_image,"Light on Yoga"),
    dataProviderToCard(name = "Miracle_A_Year_of_Food_Life.pdf",bookImage = R.drawable.miracle_a_year_of_food_life_image,"Miracle"),
    dataProviderToCard(name = "The_War_of_Art_Break.pdf",bookImage = R.drawable.the_war_of_art_break_image,"War of Art Break"),
)

