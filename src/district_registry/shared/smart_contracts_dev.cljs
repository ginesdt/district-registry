(ns district-registry.shared.smart-contracts-dev)

  (def smart-contracts
    {:ds-guard {:name "DSGuard" :address "0x1b0df820c40b7e20acf01068311a8813298ad06f"} :minime-token-factory {:name "MiniMeTokenFactory" :address "0x24c51375f85def94f73c65701d4a2a14010ae0c7"} :DNT {:name "District0xNetworkToken" :address "0x15eb7ea866ff47fcb94b5422e2cfb6f31c9e6757"} :district-registry-db {:name "EternalDb" :address "0xbb123fed696a108f1586c21e67b2ef75f210b329"} :param-change-registry-db {:name "EternalDb" :address "0x53de2dc24a27918d6aa1f2eb7a3784ba6dd78e95"} :district-registry {:name "DistrictRegistry" :address "0xa52764345637369e82727d840abbf09ce163dd12"} :district-registry-fwd {:name "MutableForwarder" :address "0xf18b47db266a06b878a2fad42190afb688447fe2" :forwards-to :district-registry} :param-change-registry {:name "ParamChangeRegistry" :address "0x110df298adbbba0283db184c221e1573ac2e0e9c"} :param-change-registry-fwd {:name "MutableForwarder" :address "0x9276027439f65900ca74e9278e9f9f97ffcdab01" :forwards-to :param-change-registry} :power {:name "Power" :address "0x9aa3a6f9d343d31c37218cd8b32ae6d1b0fa6d96"} :stake-bank {:name "StakeBank" :address "0x84a0259c3c87df92d5af85c2d743b70b8fadb9bb"} :challenge {:name "Challenge" :address "0xef4f6d37f3c678f5c3c7b93a543eacd69e6ae8be"} :district-challenge {:name "DistrictChallenge" :address "0x6e63f7831482c5d0d168e53c7e6119dac104227e"} :ENS {:name "ENS" :address "0xf57e6646616f6b2140039c1aa5480757c9431514"} :public-resolver {:name "PublicResolver" :address "0xbc8fbb080cabfea9f0f59fdf1548f4958420e184"} :aragon/acl {:name "ACL" :address "0x3459528f59dc7eba2588f67bf4351712dc9a8a26"} :aragon/evm-script-registry-factory {:name "EVMScriptRegistryFactory" :address "0xfb6bcf833954b28441fc915cb556daa1c2bc8592"} :aragon/kernel {:name "Kernel" :address "0xeaf403518a7b14de0bad5d852530dcc50e869ad5"} :aragon/dao-factory {:name "DAOFactory" :address "0x34eadf4e48b1e68560213f0729bb817b45783072"} :aragon/ens-subdomain-registrar {:name "ENSSubdomainRegistrar" :address "0x50cba6c1bcb59210f99c612c70bf4bc41176a5ef"} :aragon/fifs-resolving-registrar {:name "FIFSResolvingRegistrar" :address "0x5109bb39079135cd123796afc5baf8f71d14e379"} :aragon/repo {:name "Repo" :address "0x3be7326106a0b0b66c1da129b84ab19cdf39802d"} :aragon/apm-registry {:name "APMRegistry" :address "0xa72460c185f3f128b05644e8edd078b98f79fb53"} :aragon/apm-registry-factory {:name "APMRegistryFactory" :address "0x98f93ed24052ceed35741beee1d75287cb297137"} :aragon/voting {:name "Voting" :address "0x67416ad699b3c79151606daa615e5f535f3eb7bf"} :aragon/vault {:name "Vault" :address "0x238d72f241439dc78709b387a69abf984361db8c"} :aragon/finance {:name "Finance" :address "0xba05f18562411950f9015b2eff8a89fb4b383ca7"} :kit-district {:name "KitDistrict" :address "0x6edcfcdf6559d913680f8bbe29a46115ca01bd24"} :district {:name "District" :address "0xd8dd97cc9ce48492aa410ad17b0b870433ce4704"} :param-change {:name "ParamChange" :address "0x84956d1cb5e0140057f5af5b4af3b1e426f5fb61"} :district-factory {:name "DistrictFactory" :address "0x32b022a8467f552c0cf774f8af37c2f54c945246"} :param-change-factory {:name "ParamChangeFactory" :address "0x6df07480453c5a8eb999d75955d96986d474841f"}})
