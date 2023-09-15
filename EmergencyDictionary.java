public class EmergencyDictionary {

    /**
     * This is a list of words you can use in a pinch to get your code moving, long term you are required to have your
     * code work with the getWords method. This DEFEINITELY isn't enough words, and java literally won't let me put all
     * the words into an array like this (trust me I tried)
     */
    public static String[] EMERGENCY_WORDS = {
            "Aachen",
            "Afghans",
            "Aleichem",
            "Alston",
            "Anatolian",
            "Antananarivo",
            "Arapaho",
            "Arthur",
            "Audion",
            "Babylons",
            "Baptists",
            "Bayonne",
            "Benelux",
            "Bethlehem",
            "Blythe",
            "Bourbon",
            "Briana",
            "Bryant",
            "Buxtehude",
            "Cameron",
            "Carlene",
            "Catalonia",
            "Champlain",
            "Chennai",
            "Christian",
            "Cleveland",
            "Concetta",
            "Corinth",
            "Crimea",
            "Dacron",
            "Deadhead",
            "Derrick",
            "Dodoma",
            "Dudley",
            "Edwardo",
            "Englisher",
            "Estrada",
            "Falklands",
            "Finland",
            "Franco",
            "Fuller",
            "Gatorade",
            "Gibraltar",
            "Golding",
            "Gregory",
            "Gutenberg",
            "Harare",
            "Hefner",
            "Herschel",
            "Hittite",
            "Horton",
            "Idahos",
            "Iroquoian",
            "Jahangir",
            "Jennie",
            "Jordanians",
            "Kandinsky",
            "Kennith",
            "Kissinger",
            "Kronecker",
            "Langley",
            "Leeuwenhoek",
            "Libyans",
            "Lollobrigida",
            "Lupercalia",
            "Maginot",
            "Mamore",
            "Margie",
            "Marxisms",
            "Mazatlan",
            "Meighen",
            "Merritt",
            "Millay",
            "Mogadishu",
            "Montgomery",
            "Muhammadan",
            "Nanette",
            "Nehemiah",
            "Nicosia",
            "November",
            "Okefenokee",
            "Orwell",
            "Panamanian",
            "PayPal",
            "Pfizer",
            "Pirandello",
            "Pontianak",
            "Prometheus",
            "Qaddafi",
            "Rasalgethi",
            "Rhenish",
            "Rodger",
            "Roslyn",
            "Sabrina",
            "Sanskrit",
            "Schlesinger",
            "Seconal",
            "Sextans",
            "Shields",
            "Sisyphus",
            "Southerner",
            "Staubach",
            "Sucrets",
            "Swedish",
            "Tangiers",
            "Terrence",
            "Tibetan",
            "Townsend",
            "Tucker",
            "Unions",
            "Vassar",
            "Vilyui",
            "Walters",
            "Wheeler",
            "Windows",
            "Xeroxes",
            "Zachery",
            "abandonment",
            "abilities",
            "abraded",
            "absolving",
            "academical",
            "acclamation",
            "accredits",
            "acidified",
            "acronym",
            "adaptable",
            "adhesive",
            "administration",
            "adrenal",
            "adverbs",
            "aeronautics",
            "afforested",
            "agglomerates",
            "agreeable",
            "airmailing",
            "algebra",
            "allegros",
            "alluvia",
            "aluminum",
            "ambling",
            "amorousness",
            "anachronism",
            "ancestor",
            "aneurysm",
            "annexation",
            "anorexia",
            "anthropoids",
            "antiquated",
            "aphasics",
            "apparelled",
            "applicability",
            "apprenticeships",
            "aqueous",
            "archers",
            "aristocratic",
            "arranger",
            "articulations",
            "ashamed",
            "assails",
            "assign",
            "asters",
            "atheist",
            "attended",
            "auctioned",
            "austerer",
            "automobiling",
            "avocadoes",
            "babbled",
            "backgammon",
            "backstroked",
            "bailiwicks",
            "ballpoint",
            "banging",
            "baptistries",
            "baritones",
            "barroom",
            "bastion",
            "bawling",
            "beatifications",
            "bedevilled",
            "befell",
            "behemoth",
            "belligerency",
            "beneficially",
            "besieging",
            "betrayers",
            "bibliography",
            "biking",
            "biochemistry",
            "birthers",
            "bivouacked",
            "bladder",
            "blazing",
            "blindingly",
            "blondness",
            "blowguns",
            "blunders",
            "bobbins",
            "boleros",
            "boobies",
            "bootblacks",
            "botanists",
            "bouquets",
            "braggers",
            "brattiest",
            "breaks",
            "bribed",
            "brimful",
            "broadsides",
            "brothels",
            "brutalities",
            "budgetary",
            "bulkiest",
            "bumbles",
            "burdensome",
            "burrito",
            "busybodies",
            "buzzing",
            "cackling",
            "calamitous",
            "calligrapher",
            "cameos",
            "candelabras",
            "canoeist",
            "capaciously",
            "captains",
            "carded",
            "carjackers",
            "carping",
            "caseload",
            "castrate",
            "catbird",
            "cathedral",
            "cauterizes",
            "celebrities",
            "centigrade",
            "certification",
            "chalice",
            "changeable",
            "charbroiling",
            "chastisement",
            "checkmates",
            "chemist",
            "chiefs",
            "chinning",
            "chloroform",
            "choristers",
            "chugging",
            "cinemas",
            "circumscriptions",
            "clairvoyants",
            "clashes",
            "cleansed",
            "client",
            "clobbers",
            "cloudiness",
            "clutters",
            "coccis",
            "codger",
            "cognomens",
            "collaborating",
            "collier",
            "colorfast",
            "comeuppances",
            "commentate",
            "commonly",
            "companionways",
            "competitiveness",
            "complimentary",
            "compromising",
            "concentration",
            "conclusive",
            "conditioner",
            "conferred",
            "conflicts",
            "congratulated",
            "conked",
            "consecrates",
            "consolidate",
            "constrains",
            "contacted",
            "contiguity",
            "contradistinctions",
            "contuses",
            "converts",
            "cooled",
            "copulating",
            "cornflakes",
            "correctives",
            "corsets",
            "costuming",
            "counter",
            "counterweight",
            "cousin",
            "coyest",
            "craned",
            "crazed",
            "credulity",
            "cricks",
            "critique",
            "crosser",
            "cruciforms",
            "crusades",
            "cuddled",
            "cunninger",
            "currently",
            "custard",
            "cyclist",
            "dahlias",
            "dandelion",
            "dastardly",
            "deadbeat",
            "debarment",
            "decades",
            "deceptiveness",
            "decolonization",
            "decriminalize",
            "defeat",
            "definable",
            "defrosting",
            "delaying",
            "delirious",
            "demerit",
            "demonstratively",
            "denounced",
            "dependent",
            "deposits",
            "derails",
            "descendent",
            "designation",
            "desserts",
            "deteriorated",
            "detriment",
            "devote",
            "diagrammatic",
            "dictation",
            "diffusely",
            "dillydallies",
            "dioceses",
            "disable",
            "disarranges",
            "disciplinary",
            "discontentedly",
            "discreetly",
            "disengage",
            "dished",
            "disinterring",
            "disobliging",
            "displace",
            "disquieted",
            "disservices",
            "distill",
            "distrustfully",
            "divesting",
            "docketing",
            "doghouse",
            "domination",
            "dorsal",
            "dowelled",
            "drabbest",
            "drawbridge",
            "dribbler",
            "drooping",
            "drunks",
            "dumbfounding",
            "dusting",
            "eaglets",
            "earwig",
            "economic",
            "educates",
            "egalitarian",
            "elaborately",
            "electrocutions",
            "eligible",
            "emanating",
            "embittering",
            "emeritus",
            "empiricism",
            "enamels",
            "encounter",
            "endless",
            "enforcing",
            "enjoys",
            "enroll",
            "entertainers",
            "entrants",
            "environment",
            "epithet",
            "equitable",
            "errors",
            "esplanade",
            "etchings",
            "evaluates",
            "evictions",
            "examine",
            "excision",
            "excuse",
            "exhaustive",
            "exorbitantly",
            "expedite",
            "explanations",
            "expostulates",
            "extensional",
            "extractors",
            "exuberantly",
            "facetted",
            "faintness",
            "falter",
            "farcical",
            "fatalism",
            "favoring",
            "feebly",
            "fending",
            "fetishes",
            "fidgeted",
            "filibusters",
            "financed",
            "firebreaks",
            "fishermen",
            "flabbergasts",
            "flanks",
            "flatterers",
            "flexed",
            "flitted",
            "flounces",
            "flunkey",
            "flypapers",
            "folksy",
            "footlockers",
            "forebear",
            "forensic",
            "forewomen",
            "formatting",
            "fortunate",
            "fowling",
            "franchising",
            "freehand",
            "fresco",
            "frillier",
            "frostbites",
            "frying",
            "functional",
            "furnace",
            "fuzzed",
            "galleries",
            "gander",
            "garland",
            "gasping",
            "gazelles",
            "generally",
            "gentrified",
            "germinate",
            "giantess",
            "gingivitis",
            "glamorize",
            "glimmerings",
            "glossies",
            "goalpost",
            "goldbricked",
            "gorges",
            "gracing",
            "grandiose",
            "grassed",
            "grayish",
            "griddle",
            "gritty",
            "grounders",
            "gruellings",
            "guessed",
            "gummed",
            "gutters",
            "hacking",
            "hairspring",
            "halved",
            "handicapping",
            "hangman",
            "hardhearted",
            "harped",
            "hatchets",
            "hazards",
            "headwind",
            "heartthrobs",
            "heedlessness",
            "helpings",
            "herbage",
            "hertzes",
            "hideouts",
            "hilliest",
            "hitchhiking",
            "hogging",
            "homeboy",
            "homogenize",
            "hoodoo",
            "horizontals",
            "hosanna",
            "hottest",
            "howitzers",
            "humanoids",
            "hunched",
            "husbanded",
            "hydrogenating",
            "hyping",
            "icebreaker",
            "idling",
            "illuminates",
            "imitations",
            "immortality",
            "impatience",
            "impermanence",
            "implicating",
            "impotently",
            "improperly",
            "inadequate",
            "incarceration",
            "inclement",
            "inconsistencies",
            "incrusts",
            "indemnified",
            "indignity",
            "induced",
            "inelegantly",
            "infants",
            "infinities",
            "informative",
            "inhabit",
            "initialling",
            "innocently",
            "insatiable",
            "insignes",
            "installment",
            "instrumentals",
            "integrate",
            "interactive",
            "interference",
            "intermingling",
            "interprets",
            "interviewee",
            "intrenched",
            "invade",
            "investigates",
            "inward",
            "irrelevant",
            "isolationists",
            "jackboots",
            "jaundicing",
            "jersey",
            "jinnis",
            "jollied",
            "joystick",
            "jumpier",
            "juxtaposing",
            "kettledrum",
            "kidnaping",
            "kinfolks",
            "kneading",
            "knuckleheads",
            "lackadaisical",
            "lambasted",
            "landlady",
            "larboards",
            "lateral",
            "laureates",
            "laziness",
            "leastwise",
            "legalizes",
            "leitmotifs",
            "letter",
            "liaison",
            "licentiates",
            "lighthearted",
            "limped",
            "linnet",
            "listens",
            "liveliest",
            "lobster",
            "loganberry",
            "longevity",
            "loquacious",
            "lowered",
            "lumbar",
            "lushness",
            "machine",
            "magazines",
            "mahatmas",
            "majoring",
            "malleable",
            "mandrakes",
            "manipulates",
            "manufacturing",
            "marinas",
            "marries",
            "masochist",
            "mastodons",
            "matrixes",
            "maybes",
            "meatloaves",
            "meditative",
            "melodically",
            "mending",
            "mercuric",
            "messieurs",
            "methanol",
            "micrometers",
            "midwived",
            "militia",
            "mimicked",
            "minimalists",
            "minutiae",
            "miscarriages",
            "misdirection",
            "misjudges",
            "misruled",
            "mistresses",
            "mockers",
            "modulus",
            "molybdenum",
            "monkeyshine",
            "monsignors",
            "moraine",
            "mortgages",
            "motionless",
            "mountaineering",
            "mowing",
            "mulched",
            "multivariate",
            "muscling",
            "mustiness",
            "mystics",
            "narcosis",
            "nattily",
            "nebula",
            "negativity",
            "neptunium",
            "neutralizer",
            "nicest",
            "nighttime",
            "noblewomen",
            "noncommittally",
            "nonpolluting",
            "normalizing",
            "notepaper",
            "nuclei",
            "nuptials",
            "obedience",
            "oblongs",
            "obstetrical",
            "occult",
            "offender",
            "oiliest",
            "onomatopoeic",
            "opining",
            "optometrists",
            "ordinance",
            "originator",
            "osprey",
            "outcries",
            "outlaying",
            "outrider",
            "outvoted",
            "overbore",
            "overemphasized",
            "overlap",
            "overrated",
            "oversize",
            "overtone",
            "oxygenates",
            "paginates",
            "palindrome",
            "pamphleteers",
            "pantheon",
            "paradise",
            "paraphrasing",
            "parity",
            "parsing",
            "partly",
            "pasteurizing",
            "patiently",
            "pauper",
            "peaked",
            "pedestal",
            "pelleted",
            "penlite",
            "perambulate",
            "perfidies",
            "perish",
            "peroxided",
            "personalize",
            "pervasive",
            "petticoat",
            "pheasants",
            "phloxes",
            "photographically",
            "piccolos",
            "pierced",
            "pilings",
            "pinion",
            "pirating",
            "pizzeria",
            "plaited",
            "platforming",
            "pleader",
            "plodded",
            "plunged",
            "podded",
            "polemical",
            "pollutants",
            "pomade",
            "popgun",
            "portals",
            "positives",
            "postmodern",
            "potshot",
            "practicals",
            "preambled",
            "preconceives",
            "predominant",
            "pregnant",
            "preordaining",
            "preschool",
            "pressuring",
            "pretty",
            "priest",
            "prioress",
            "probably",
            "proctor",
            "proffering",
            "programmes",
            "prominent",
            "proofs",
            "proportionals",
            "proselytized",
            "protested",
            "provinces",
            "psychiatry",
            "publisher",
            "pulsars",
            "punishing",
            "purity",
            "pushovers",
            "quackery",
            "qualitative",
            "quashing",
            "quibbling",
            "quitters",
            "racket",
            "raffles",
            "raisin",
            "ranges",
            "rarities",
            "rattlers",
            "reactivate",
            "reallocates",
            "reasonable",
            "rebuffed",
            "recenter",
            "recklessness",
            "recompilation",
            "records",
            "recuperate",
            "redesigning",
            "redressing",
            "reenters",
            "refineries",
            "refrain",
            "regained",
            "regressions",
            "reigned",
            "reiterated",
            "relaxing",
            "reloading",
            "reminiscences",
            "renaissance",
            "renumbering",
            "repealing",
            "replicated",
            "reprints",
            "repulse",
            "rescued",
            "residuals",
            "respectability",
            "restfullest",
            "resumes",
            "retelling",
            "retrench",
            "retweets",
            "reverberates",
            "revivalists",
            "reworking",
            "richly",
            "righteous",
            "ripping",
            "roadways",
            "roiling",
            "roosters",
            "roughened",
            "rowdiness",
            "ruffian",
            "runnels",
            "sachet",
            "sagacious",
            "saliva",
            "sameness",
            "sanding",
            "sardonic",
            "saturates",
            "savvying",
            "scampers",
            "scarves",
            "schlepp",
            "schrods",
            "scorches",
            "scrapers",
            "scribe",
            "scruple",
            "scuttle",
            "seashores",
            "sectarian",
            "seedless",
            "selectively",
            "seminaries",
            "sensual",
            "sequenced",
            "serpent",
            "seventieths",
            "shadowboxed",
            "shampoos",
            "shaved",
            "shells",
            "shimmying",
            "shirttail",
            "shopaholic",
            "shotgunning",
            "shredder",
            "shrunk",
            "sicken",
            "sidings",
            "signposting",
            "simpered",
            "singular",
            "sixties",
            "skimpier",
            "skyjacked",
            "slantwise",
            "sleekly",
            "slideshow",
            "slogging",
            "slumber",
            "smearing",
            "smooch",
            "snakiest",
            "sniggered",
            "snorted",
            "snugger",
            "sociopaths",
            "solemnity",
            "solving",
            "sophistication",
            "soulless",
            "souvenir",
            "sparely",
            "spears",
            "speculation",
            "spherical",
            "spinsterhood",
            "splaying",
            "spokeswomen",
            "sportsmanlike",
            "springier",
            "sputter",
            "squeal",
            "squishy",
            "stairs",
            "stanchions",
            "starring",
            "statue",
            "steams",
            "stepparent",
            "stickleback",
            "stingiest",
            "stockyard",
            "stoppages",
            "stragglier",
            "strapless",
            "strengths",
            "stringy",
            "struggles",
            "stumped",
            "styptic",
            "subjugating",
            "subpoena",
            "substation",
            "subverting",
            "suffering",
            "suites",
            "summery",
            "sunroofs",
            "superlatively",
            "supplement",
            "surcharge",
            "surprise",
            "suspicions",
            "swashbuckling",
            "sweethearts",
            "swishes",
            "symbiosis",
            "syndicate",
            "tableaux",
            "taffeta",
            "tamale",
            "tantalizes",
            "tarter",
            "taverns",
            "tearooms",
            "teething",
            "televangelist",
            "temptress",
            "tenser",
            "terrains",
            "testis",
            "theocracies",
            "theses",
            "thirteen",
            "threads",
            "throttle",
            "thwack",
            "tightwads",
            "tinderboxes",
            "tiredest",
            "tocsins",
            "tomboy",
            "topically",
            "torrid",
            "toughest",
            "tracery",
            "trainee",
            "transceiver",
            "transgressing",
            "transmutes",
            "trapping",
            "treadmills",
            "trends",
            "triennial",
            "tripped",
            "tropes",
            "truckers",
            "trustworthier",
            "tumors",
            "turnips",
            "tweeting",
            "twofers",
            "tyroes",
            "unabridged",
            "unbearably",
            "unceasingly",
            "uncompromisingly",
            "undecidable",
            "underestimated",
            "underplay",
            "undertakings",
            "undulates",
            "unfairly",
            "unfunny",
            "unhorsed",
            "uninvited",
            "unleash",
            "unmoral",
            "unprejudiced",
            "unreliability",
            "unscrupulous",
            "unspeakably",
            "untidiest",
            "unwieldiness",
            "upheld",
            "upstart",
            "usefulness",
            "vacationer",
            "validated",
            "vaporization",
            "vaunting",
            "vengeance",
            "veriest",
            "vestment",
            "victimizing",
            "villas",
            "virtual",
            "vitals",
            "vociferously",
            "votaries",
            "waddle",
            "walked",
            "wantoning",
            "warranting",
            "wastewater",
            "watershed",
            "wealth",
            "webmistresses",
            "welcome",
            "whaled",
            "whether",
            "whiskers",
            "wholes",
            "wieners",
            "wimpier",
            "wineries",
            "wisecracked",
            "witting",
            "woodchucks",
            "wordier",
            "worried",
            "wreaking",
            "writers",
            "yarmulke",
            "yoghurts",
            "zigzagged",
    };
}
