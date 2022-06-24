import Member from "./Member";

const MemberList = ({listOfMembers}) => {

    const memberComponents = listOfMembers.map((member, index) => {
        return <Member member={member} key={index}/>
    });

    // keys...
    // react needs to know exactly wht its updating at any given point
    // by giving each one a unique identifier (key) it makes it more efficient when compiling
    // can point to which member at which key it needs to change 

    // list of members has an array with 4 member objects in it
    // if we map this into member components we get another array with a member component for each of the 4 member objects

    return(
        <>
            {memberComponents}
        </>
    )
}

export default MemberList;