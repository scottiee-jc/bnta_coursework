import MemberList from "../components/MemberList";
import NewMember from "../components/NewMember";
import Status from "../components/Status";
import { useState } from "react";

// use state is a function that gives us 
// 1 a variable we can use to track
// 2 a function we can use to update it

const MemberContainer = () => {

    const [members, setMembers] = useState ([
        {
            name: "Colin",
            email: "colin@brightnetwork.co.uk",
            employeeNumber: 123
        },
        {
            name: "Anna",
            email: "anna@brightnetwork.co.uk",
            employeeNumber: 234
        },
        {
            name: "Phil",
            email: "phil@brightnetwork.co.uk",
            employeeNumber: 345
        },
        {
            name: "Valeria",
            email: "valeria@brightnetwork.co.uk",
            employeeNumber: 456
        },
    ]);

    const [applicationOpen, setApplicationsOpen] = useState(true);

    const addNewMember = (newMember) => {

        setMembers([...members, newMember]);
        // tells react, set members to whatever members was before + newMember
        console.log("added new member");
    }

    const updateApplicationStatus = () => {
        console.log("updating status")
        setApplicationsOpen(!applicationOpen)
        // this says to react - state has changed, figure out what needs to be updated
        // means when we use the button it will change "applications are open" to "applications are closed"
    }



    return (
        <>
        {/* return the member list componenet, referring to the variable listOfMembers to return these */}
            <NewMember handleButtonClick={addNewMember}/>
            <MemberList listOfMembers={members}/>
            <Status 
            applicationsOpen={applicationOpen} 
            handleButtonClick={updateApplicationStatus}
            />
        </>
    )
}

export default MemberContainer;